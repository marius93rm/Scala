/* Scrivere un metodo Scala findIndices che, 
data una lista l e un elemento x, restituisce una lista che contiene gli indici
i tali che l(i) == x.
Se la lista non contiene x, il metodo restituisce una lista vuota */
def findIndices(l: List[Int], x:Int): List[Int] = {
    var risposta = List[Int]()
    for (i <- 0 until l.length) {
        if (l(i) == x) risposta = risposta :+ i
    }
}

def findIndicesRec(l: List[Int], x:Int): List[Int] = {
    def findIndicesRecAux(l: List[Int], x:Int, i:Int): List[Int] = {
        if (l.isEmpty) List[Int]()
        else if (l.head == x) i :: findIndicesRecAux(l.tail, x, i+1)
        else findIndicesRecAux(l.tail, x, i+1)
    }
    findIndicesRecAux(l, x, 0)
}


// (2,3,9) -> true (crescente)
// (2,1,9) -> false (random)
// (9,1,2) -> false (decrescente)
def isSorted(l: List[Int]): Boolean = {
    var risposta = true
    for(i <- 0 until l.length-1) {
        if (l(i) > l(i+1)) risposta = false
    }
    return risposta
}

/*Scrivere un metodo Scala removeDuplicates(l:List[Int]):List[Int] 
che crea una nuova lista ottenuta da l rimuovendo gli elementi duplicati.
*/

/* Scrivere un metodo Scala consecutivi che, data una lista generica di n elementi, 
restituisce la lista di n-1 coppie che contiene tutti gli elementi
consecutivi della lista di ingresso. Ad esempio, se in ingresso viene
dato List(3,6,5,7), il metodo deve produrre List((3,6),(6,5),(5,7)).
Se la lista di ingresso contiene meno di due elementi, la funzione deve produrre la lista vuota. */

/* Scrivere un metodo Scala max che, data una lista di stringhe,
restituisce la lunghezza della stringa più lunga.
Suggerimento: usare map e reduce
*/


@main def run() =
    val l = List(2,5,6,7,3,6)

        
