# Foglio — Template per BOOX

Un generatore di pagine che gira interamente nel browser o nella app Android. Non richiede account, non carica dati e i fogli vengono creati sul dispositivo. L'interfaccia usa contrasti netti, sfondo bianco, controlli grandi e niente effetti animati, così resta leggibile su display e-ink.

## Prova rapida

Apri `index.html` nel browser. Per usarlo come app installabile e avere l'avvio offline del browser, i file vanno pubblicati su un indirizzo HTTPS. La cartella contiene già il manifest e il service worker necessari.

## Usa un foglio su BOOX

1. Scegli struttura, formato, spaziatura, margini e colore.
2. Esporta in PDF (vettoriale e con le dimensioni reali) o in PNG.
3. Salva o trasferisci il file nella cartella `Storage/noteTemplate` del BOOX Note Air5 C. BOOXDrop può trasferirlo dal telefono o dal computer.
4. Nell'app Note, apri il menu Template → Custom → Add e seleziona il file.

## Profili e opzioni

Il profilo iniziale è BOOX Note Air5 C in verticale. Puoi scegliere anche BOOX 10,3″, BOOX Tab X C / Note Max 13,3″, A4, A5 e Letter, e cambiare orientamento. Quadretti, puntinato, righe, isometrico, esagonale, Cornell e pagina bianca; spaziatura e margine, righe principali, colore, spessore, titolo e campo data.

I template restano semplici fogli singoli: non includono agenda multipagina o collegamenti interni. I profili BOOX seguono le proporzioni dello schermo, non la misura della cornice.

## APK Android

La cartella `android` contiene il progetto sorgente Android. La schermata è inclusa come risorsa locale e l'esportazione apre il selettore di salvataggio di Android. L'APK di debug compilato è disponibile come `outputs/Foglio-Template-BOOX.apk`. Puoi trasferirlo al Boox e aprirlo per installare l'app; se Android chiede l'autorizzazione per installare da questa sorgente, abilitala per l'app che apre il file.
