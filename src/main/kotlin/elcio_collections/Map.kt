package elcio_collections

fun main() {
    val pair : Pair<String,Int> = Pair ("Joao", 2000)
    val map1 = mapOf(pair)

    map1.forEach { (k,v) -> println(" Chave: $k - Valor: $v") }

    val map2 = mapOf        (
        "Pedro"  to 3000,
        "Maria"  to 1500    )

    map2.forEach { (k,v) -> println(" Chave: $k - Valor: $v") }
}