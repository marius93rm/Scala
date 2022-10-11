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

def nuovaStampa(matrice: Array[Array[Int]]): Unit = {
  //media
  
  var somma:Float = 0
  val dim = matrice.length
  
  for (i <- 0 to matrice.length-1) {
    for (j <- 0 to matrice(i).length-1) {
      somma += matrice(i)(j)
    }
  }
  val media = somma/(matrice.length*matrice.length)
  println("La media degli elementi della matrice è: " + media)

  val risultato = Array.ofDim[Int](dim,dim)

  var x = 0
  var y = 0

  for (i <- 0 until dim) {
    for (j <- 0 until dim) {
      if(matrice(i)(j) > media) {
        risultato(x)(y) = matrice(i)(j)
        if(y < dim-1) {
          y += 1
        }
        else {
          y = 0
          x += 1
        }
      }
      else {
        //niente
      }
    }
  }

  for (i <- x until dim) {
    if (i==x){
      for (j <- y until dim) {
        risultato(i)(j) = 1
      }
    }
    else {
      for (j <- 0 until dim) {
        risultato(i)(j) = 1
      }
    }  
  }


  //stampa risutlato
  for (i <- 0 until dim) {
    for (j <- 0 until dim) {
      print(risultato(i)(j) + "  ")
    }
    println()
  }

}

@main def run() =
  // // matriceRandom(10,10)
  
  //creo random
  val dim = Random.between(8, 20)
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

  nuovaStampa(mioArray)

  // //stampo la matrice
  // mediaDegliElementi(mioArray)

  // val nome = "Marius"
  // val car = nome.charAt(0)
  // println((car+4).toChar)
