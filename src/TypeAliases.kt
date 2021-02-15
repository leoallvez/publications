
//Type aliases fornecem nomes alternativos para os tipos existentes. 

//Se o nome do tipo for muito longo, você pode declarar um nome mais curto diferente e usar o novo.

//Considere o método a seguir, com um parâmetro (função callback) um pouco extenso.
fun makeMapV1(callback: (Map<String, Double>) -> Unit) = callback(doMap())

//Podemos declarar um type aliase com o callback.
typealias Callback = (Map<String, Double>) -> Unit

//Usando o type aliases o mesmo método fica mais legível e sucinto.
fun makeMapV2(callback: Callback) = callback(doMap())

//Se você usar o mesmo tipo em vários lugares pode ser uma boa alternativa o uso de type aliase,
//assim você poderia centralizar alterações.

fun doMap() = mapOf("Um" to 1.0, "Um e meio" to 1.5, "Dois" to 2.0)

fun main() {
    makeMapV2 { 
        it.forEach { println(it) } 
    }
}
