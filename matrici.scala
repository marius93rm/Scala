import scala.util.Random

def matriceRandom(righe:Int, colonne:Int) = {
    var mioArray = Array.ofDim[Int](righe,colonne)

    var sommaRighe = Array.ofDim[Int](righe)
    var sommaColonne = Array.ofDim[Int](colonne)
    
    for (i <- 0 to righe-1) {
      for (j <- 0 to colonne-1) {
        mioArray(i)(j) = Random.between(1, 10)
        sommaRighe(i) += mioArray(i)(j)
        sommaColonne(j) += mioArray(i)(j)
      }
    }

    for (i <- 0 to righe-1) {
      for (j <- 0 to colonne-1) {
        print(mioArray(i)(j) + "  ")
      }
      print("  | " + sommaRighe(i))
      println()
    }
    for (i <- 0 to colonne-1) {
      print(sommaColonne(i) + " ")
    }
}

def mediaDegliElementi(matrice: Array[Array[Int]]):Unit = {
  var somma:Float = 0
  for (i <- 0 to matrice.length-1) {
    for (j <- 0 to matrice(i).length-1) {
      somma += matrice(i)(j)
    }
  }
  val media = somma/(matrice.length*matrice.length)
  println("La media degli elementi della matrice è: " + media)

  //stampa matrice
  for (i <- 0 to matrice.length-1) {
    for (j <- 0 to matrice(i).length-1) {
      if(matrice(i)(j) > media) {
        print(matrice(i)(j) + "  ") 
    }
    else print(0 + "  ")
    }
    println()
  }


}

@main def run() =
  // matriceRandom(10,10)
  
  //creo random
  val dim = Random.between(2, 10)
  //matrice quadrata
  var mioArray = Array.ofDim[Int](dim,dim)
  //ciclo le righe
  for (i <- 0 until dim) {
    //ciclo le colonne
    for (j <- 0 until dim) {
      mioArray(i)(j) = Random.between(1, 10)
    }
  }

  //stampa matrice
  for (i <- 0 until dim) {
    for (j <- 0 until dim) {
      print(mioArray(i)(j) + "  ")
    }
    println()
  }

  println("-----------")

  //stampo la matrice
  mediaDegliElementi(mioArray)