# Foglio BOOX

Versione corrente: **0.1**.

App Android offline per creare fogli personalizzati da usare come template nell'app Note dei dispositivi BOOX. Il profilo iniziale è Note Air5 C; sono disponibili anche altri profili BOOX e formati A4, A5 e Letter.

> Disclaimer: vibe-coded with GPT-6 Luna.

## Funzioni

- Quadretti, puntinato, righe, griglia isometrica ed esagonale, Cornell e foglio bianco.
- Spaziatura, margini, colore e spessore regolabili, con anteprima dal vivo.
- Esportazione PDF vettoriale e PNG tramite il selettore file Android.
- Interfaccia ad alto contrasto e senza animazioni, adatta agli schermi e-ink.
- Elaborazione locale; non richiede account né connessione per creare i template.

## Compilazione Android

Apri `android/` con Android Studio, installa Android SDK Platform 35 e usa **Build > Build APK(s)**. L'APK di debug supporta Android 8.0 o successivo; il Note Air5 C usa Android 15.

## Uso su BOOX

Esporta un PDF o PNG, salvalo o trasferiscilo nella cartella `Storage/noteTemplate`, poi aggiungilo da **Note → Template → Custom → Add**.

## Origine e licenza

Foglio è un'implementazione indipendente: non incorpora codice, immagini o marchi di Incompetech. Il generatore Incompetech che ha ispirato il progetto dichiara la propria applicazione e i PDF prodotti sotto CC0 1.0; ciò non implica affiliazione o approvazione da parte di Incompetech o Kevin MacLeod.

I file originali di questo progetto sono dedicati al pubblico dominio con **CC0 1.0**. Consulta `LICENSE`. Android SDK, Android Gradle Plugin e gli strumenti di build restano soggetti alle rispettive licenze.
