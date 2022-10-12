def criptaCesare(frase: String, key: Int): String = {
    val dizionario = ('a','b','c','d','e','f','g','h','i','l','m','n','o','p','q','r','s','t','u','v','z')
    var fraseCifrata = ""
     
    for (i <- 0 until frase.length()){
        frase.charAt(i)
        //cerca la lettera nella lista
        for(j <- 0 until dizionario.length()){
            if(frase.charAt(i) == dizionario(j)){
                fraseCifrata += dizionario((j+key)%dizionario.length())
            }
        }
    }

    return fraseCifrata

}

def decriptaCesare(frase: String, key: Int): String = {
    val dizionario = ('a','b','c','d','e','f','g','h','i','l','m','n','o','p','q','r','s','t','u','v','z')
    var fraseDecifrata = ""

    for (i <- 0 until frase.length()){
        frase.charAt(i)
        //cerca la lettera nella lista
        for(j <- 0 until dizionario.length()){
            if(frase.charAt(i) == dizionario(j)){
                fraseDecifrata += dizionario((j-key)%dizionario.length())
            }
        }
    }

}

def decriptCesar(frase: String, key: Int): String = {
    frase.
}

@main def run() =
    val cifrato = "DZZDFFDUHLONNUUNGAFNENONLDOONDOODRUDVHVZD"
    val chiaro = "attaccaregliirriducibiligalliallaorasesta"
    val chiave = 3

    print("Frase cifrata: ")
    println(cifrato)
    print("Frase decriptata: ")
    println(decriptaCesare(cifrato, chiave))
    println("--------------------")
    print("Frase chiaro: ")
    println(chiaro)
    print("Frase criptata: ")
    println(criptaCesare(chiaro, chiave))

    decriptCesar("DZZDFFDUHLONNUUNGAFNENONLDOONDOODRUDVHVZD", 3)



