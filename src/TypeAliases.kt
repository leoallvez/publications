
//Os aliases de tipo fornecem nomes alternativos para os tipos existentes. 
//Se o nome do tipo for muito longo, você pode inserir um nome mais curto diferente e usar o novo.

//Considere o tipo a seguir
typealias Callback = (Map<String, Double>) -> Unit

fun doMap() = mapOf("Um" to 1.0, "Um e meio" to 1.5, "Dois" to 2.0)

fun makeMapV1(callback: (Map<String, Double>) -> Unit) = callback(doMap())

fun makeMapV2(callback: Callback) = callback(doMap())

fun main() {
    makeMapV2 { 
        it.forEach { println(it) } 
    }
}
