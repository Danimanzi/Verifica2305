Cosa fare nella esercitazione di info: 

Scrivere un programma Java che utilizzi la classe LinkedList per gestire una lista di numeri interi. Il programma deve fornire le seguenti funzionalità:
-	Aggiungere un numero in coda alla lista
-	Rimuovere il primo elemento della lista
-	Visualizzare il contenuto della lista

CLASSE TEST:
serve per crere i veicoli e apportare modifiche alle auto 


# GIT 

come iniziare:

visto che git bash c'è già, inizio a scrivere il README.md 

# git bash 

## configurazione del repository locale e sincronizzazione 

scrivere su `git-bash`: 

```
cd $HOME/Desktop/Verifica2305/ # cambia da pc a pc, nel mio caso è questo percorso 
git init  # Inizializza il repository locale 
git config user.email "daniele.manzini@salesianiverona.it"
```

![cattura1](cattura1.png)

io inserisco prima di solito il README.md, una volta caricato il README.md su git (online), metto anche tutto il resto 

```
git add README.md # Inserimento del file README.md nell'area di staging
git commit -m "inserisco md" # Creazione del primo commit, che serve a sincronizzare il repository locale con lo stage 
git branch -M main # Creazione del branch main, da usare come default 
git remote add origin https://github.com/Danimanzi/Verifica2305.git # Connessione del repository remoto al repository locale
git push https://Danimanzi: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@github.com/Danimanzi/Verifica2305.git # Sincronizzazione del repository remoto con quello locale
```

![cattura2](cattura2.png)

se appare questa finestra selezionare `manager-ui`. 

![manager-ui](manager-ui.png)


se la `push` non dovesse andare, bisogna creare un token: 

- aprire il seguente link https://github.com/settings/tokens
- generare un token mediante Generate new token (classic)
- confermare l'accesso inserendo la propria password, se richiesto
- in Note inserire un messaggio come "token di accesso"
- Expiration: "No expiration"
- In Select scopes spuntare la casella accanto a repo, in modo tale da avere la situazione sottostante
- generare il token e salvarlo in un file di testo

![token](token.png)

eseguire di nuovo il comando `push` con questo formato: 
```
git push https://<username>:<token>@github.com/<username>/<reponame>.git
```
dove `<username>` è il vostro username, al posto di `<token>` bisogna inserire il token creato prima e `<reponame>` è il nome del repository sul quale si vuole effettuare il push (in questo caso, <reponame> è Git-tutorial).


## Aggiunta di nuovi file al repository

1. Creare un nuovo file `main.c` nel workspace
2. Implementare un programma che, dati in input 10 numeri positivi, trovi il massimo e lo visualizzi a video
3. Aggiungere il nuovo file nell'area di staging
4. Sincronizzare l'area di staging con il repository locale (usando un messaggio di commit congruo)
5. Sincronizzare il repository remoto con quello locale 


## Migioramento del file README.md
- Aggiungere la traccia dell'esercizio svolto
- Aggiungere una descrizione del codice
- Inserire una sezione in cui vengono spiegati i comandi utilizzati per la creazione di questo repository in stile tutorial
- Spiegare, in una nuova sezione, le funzioni base di Git

Per ognuno dei punti, effettuare, separatamente, i punti da 2 a 5 per sincronizzare i repository.

Di seguito vi sono delle istruzioni per migliorare la formattazione del file README.md

**NOTA: Il repository che creerete in questa esercitazione vi sarà utile per le prossime esercitazioni.**

## Inserire immagini nel README.md
Aggiungere l'immagine `img.jpg` al progetto ed inserirla nel testo con il seguente comando:
```![](img.png)```

## Inserire sezioni
Le sezioni possono essere create inserendo un `#` prima del titolo della sezione. Si può modificare il tipo di sezione usando da uno a sei `#`. È importante separare i `#` dal titolo con uno spazio.

## Inserire codice e citazioni
Il codice può essere inserito delimitandolo con tre backtick `.

Le citazioni possono essere fatte aggiungendo `>` prima del testo.


# comandi base

git help command # visualizza la documentazione completa relativa al comando 

git command -h # visualizza la documentazione sintetica relativa al comando specifico 

git status # visualizza la sincronizzazione con il repository del contenuto della directory in cui si è posizionati 

git log # visualizza la storia delle sincronizzazione con il repository del contenuto della directory in cui si è posizionati

git remote -v # visualizza i repository remoti utilizzati 

git diff # visualizza le differenze tra la directory in cui si è, e lo stage 

git push repository # sincronizza il repository remoto specificato con il contenuto del repository locale  
