def ordinamento( tupla: (Int, Int, Int) ): (Int, Int, Int) = {
  val (a, b, c) = tupla
  if (a < b && a < c) {
    if (b < c) (a, b, c)
    else (a, c, b)
  } else if (b < a && b < c) {
    if (a < c) (b, a, c)
    else (b, c, a)
  } else {
    if (a < b) (c, a, b)
    else (c, b, a)
}

def stampa( tupla: (Int, Int, Int) ): Unit = {
  println( tupla._1 + " " + tupla._2 + " " + tupla._3 )
  //questa funzione non RETURN niente, stampa a schermo

}

//funzione che stampa tutti i numeri pari 1-100
def printOddNumbers(): Unit = {

}

//funzione che stampa tutti i numeri dispari 1-100
def printEvenNumbers(): Unit = {

}

//funzione che stampa ogni 3 numeri 1-100
def printEveryThirdNumber(): Unit = {

}

//funzione che risolve ax^2 + bx + c = 0 stampando a schermo il risultato
def solveEquation( a: Int, b: Int, c: Int ): Unit = {

}

//stampa tutti i caratteri della stringa in input
def printAllChars( string: String ): Unit = {

}

@main def run() =

  val nome = "Mario"
  val lunghezza = nome.length

  var numeretto:Int = 33  
  val tupla = (66, 33, 99) // CREO UNA TUPLA DI INTERI  !!
  
  val (a,b,c) = (3,41,5)
  //IF come si fa
  if (a > b) { // !!
    println("vero")
  } else if(b<c){
    println("vero (else if)")
  } else {
    println("falso")
  }


  println(tupla._1) // ACCEDO(e stampo) AL PRIMO ELEMENTO DELLA TUPLA

  val valoreImm = 3 //valori immutabili
  var valoreVar = 3 //valori mutabili, però mi impegnerò ad non usarlo

  // for
  var i = 0
  val inizio = 0
  val fine = i
  for (i <- inizio to fine) {
    println(i)
  }
