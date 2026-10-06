package it.foglio.boox;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import java.io.OutputStream;

public class MainActivity extends Activity {
    private static final int CREATE_FILE = 71;
    private String pendingDataUrl;

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setStatusBarColor(0xFFFFFFFF);
        getWindow().setNavigationBarColor(0xFFFFFFFF);
        getWindow().getDecorView().setSystemUiVisibility(
                android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR |
                android.view.View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
        WebView web = new WebView(this);
        web.setBackgroundColor(0xFFFFFFFF);
        web.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        web.setWebViewClient(new WebViewClient());
        web.setWebChromeClient(new WebChromeClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);
        web.getSettings().setAllowFileAccess(true);
        web.getSettings().setAllowContentAccess(false);
        web.addJavascriptInterface(new FileBridge(), "FoglioAndroid");
        setContentView(web);
        web.loadUrl("file:///android_asset/index.html");
    }

    private class FileBridge {
        @JavascriptInterface public void saveFile(String name, String mime, String dataUrl) {
            runOnUiThread(() -> {
                pendingDataUrl = dataUrl;
                Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                intent.setType(mime == null ? "application/octet-stream" : mime);
                intent.putExtra(Intent.EXTRA_TITLE, name);
                startActivityForResult(intent, CREATE_FILE);
            });
        }
    }

    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != CREATE_FILE || resultCode != RESULT_OK || data == null || pendingDataUrl == null) return;
        Uri uri = data.getData();
        try {
            int comma = pendingDataUrl.indexOf(',');
            byte[] bytes = Base64.decode(pendingDataUrl.substring(comma + 1), Base64.DEFAULT);
            try (OutputStream out = getContentResolver().openOutputStream(uri)) { out.write(bytes); }
            Toast.makeText(this, "Template salvato", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this, "Non è stato possibile salvare il file", Toast.LENGTH_LONG).show();
        } finally {
            pendingDataUrl = null;
        }
    }
}
