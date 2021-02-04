
// Usando a conversão Single Abstract Method (SAM)

// Uma interface com apenas um método abstrato é chamada de interface funcional ou Single Abstract Method (SAM)
fun interface Clickable {
    fun click()
}

fun main() {
    // Se você não usar uma conversão SAM, precisará escrever um código como este:
    val actionA = object : Clickable {
        override fun click() {
            println("click 1")
        }
    }

    actionA.click()

    // Com a conversão SAM seu código fica mais conciso e legível usando expressões lambda:
    val actionB = Clickable {
        println("click 2")
    }

    actionB.click()
}
