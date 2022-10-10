@main def run() =
    val nome = "Giovanni" // variabile immutabile
    var numeretto:Int = 33 // variabile mutabile
    val tupla = (66, 33, 99) // tupla immutabile di interi
    val (a,b,c) = (3,41,5) // assegnamento multipla
    val tupla2 = ("ciao",5)

    // IF come si fa
    if (a > b) { // !!
      println("vero")
    } else if(b<c){
      println("vero (else if)")
    } else {
      println("falso")
    }

    // FOR come si fa
    for (i <- 1 to 10 by 2) {
      println(i)
    }

    // WHILE come si fa
    var i = 0
    while (i < 10) {
      println(i)
      i = i + 1
    }

    var isPartitaInCorso = true
    while (isPartitaInCorso) {
        // ...
    }

    print("Inserisci un numero: \n")
    print(nome)
    // Inserisci un numero: Giovanni

    println("Inserisci un numero: ")
    println(nome)
    // Inserisci un numero:
    // Giovanni

    println(nome.length()) // lunghezza di una stringa
    println("Ciao " + nome) // concatenazione di stringhe
    println( "Ciao ".concat(nome) )
    println(s"Ciao $nome") // interpolazione di stringhe
    println("Iniziale: " + nome(0)) // accesso ad un carattere di una stringa
    println("Iniziale: " + nome.charAt(0)) // accesso ad un carattere di una stringa
    println("Indice del carattere 'v': " + nome.indexOf('v')) // indice della prima occorrenza 
    println("ultima i di Giovanni: " + nome.lastIndexOf('i')) // indice dell'ultima occorrenza
    
    println("sottostringa 3 2: " + nome.substring(2,5)) // sottostringa



    print("Giovanni")