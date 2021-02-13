//funções de escopo


//Kotlin contém várias funções cujo único propósito é executar um bloco de código dentro do contexto de um objeto
//Quando você chama essa função em um objeto com uma expressão lambda fornecida, ela forma um escopo temporário

fun myFun() {
    val outside = 6.2831853071
    run {
        val inside = 1.61803398875
        // Both outside and inside are usable and in scope
    }
    // inside is out of scope, and only outside is available
}

fun main() {
    print(myFun())
}