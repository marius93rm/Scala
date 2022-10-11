def criptaCesare(frase: String, key: Int): String = {
    val dizionario = ('a','b','c','d','e','f','g','h','i','l','m','n','o','p','q','r','s','t','u','v','z')

}

def decriptaCesare(frase: String, key: Int): String = {
    val dizionario = ('a','b','c','d','e','f','g','h','i','l','m','n','o','p','q','r','s','t','u','v','z')


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



