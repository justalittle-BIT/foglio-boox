# Foglio BOOX per Android

Progetto Android nativo che incorpora Foglio in una WebView locale. Non richiede rete o permessi di archiviazione. Quando esporti un PDF o un PNG, l'app apre il selettore di salvataggio di Android.

## Compilazione

1. Apri questa cartella in Android Studio.
2. Installa Android SDK Platform 35 quando Android Studio lo richiede.
3. Sincronizza Gradle e scegli **Build > Build APK(s)**.
4. Android Studio genera l'APK di debug in `app/build/outputs/apk/debug/`.

Prima di compilare dopo aver modificato l'app web, esegui `sync-assets.sh` per aggiornare `app/src/main/assets/index.html`.

Il progetto è impostato per Android 8.0 e successivi, con compatibilità per Note Air5 C e Android 15. La cartella `android` è il sorgente del progetto. L'APK di debug compilato per questa versione si trova in `outputs/Foglio-Template-BOOX.apk`.
