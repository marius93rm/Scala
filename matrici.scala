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

@main def run() =
    
    matriceRandom(10,10)
