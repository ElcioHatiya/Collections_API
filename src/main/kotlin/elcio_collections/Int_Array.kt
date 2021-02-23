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

    val arrayOf = intArrayOf(3,8,1,9,4)
    arrayOf.sort()
    arrayOf.forEach {
        println("ArrayOf:  $it")
    }

    //Operações:
    println("Max: ${values.max()}")
    println("Min: ${values.min()}")
    println("Média: ${values.average()}")

    //Filtros:
    val filtro_maior_4 = values.filter{ it > 4 }
    filtro_maior_4.forEach{println("Filtrando maior que 4: $it")}

    //Range:
    println("Count in Range: ${values.count { it in 3..7}}")

    //Find, Any
    println("Find 3: ${values.find{it==3}}")
    println("Any 3: ${values.any{it==3}}")
}