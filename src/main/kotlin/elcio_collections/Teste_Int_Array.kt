package elcio_collections

fun main() {
    val values = IntArray(5)
    values[0] = 2
    values[1] = 4
    values[2] = 7
    values[3] = 9
    values[4] = 5

    for (valor in values) {
        println("Valor: $valor")
    }

    values.forEach {
        println("forEach(it): $it")
    }

    values.forEach { valor ->
        println("forEach(Variavel):  $valor")
    }

    values.sort()
    for (index in values.indices) {
        println("for com indicies: ${values[index]}")
    }


}