package elcio_collections

fun main() {
    val nomes = Array<String>(3) {""}
    //.. Array<Pessoa>, Array<Conta> ...
    nomes[0] = "Elcio"
    nomes[1] = "Luciana"
    nomes[2] = "Joao"

    nomes.forEach { println(it) }
}