package elcio_collections

fun main() {
    val joao =  Funcionario("Joao",5000,"CLT")
    val maria = Funcionario("Maria",2000,"PJ")
    val pedro = Funcionario("Pedro",3000,"CLT")

    val funcionarios = mutableListOf(joao,maria)
    funcionarios.forEach{println(it)}

    println("--- Add Pedro ---")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("--- Remove Maria ---")
    funcionarios.remove(maria)
    funcionarios.forEach{println(it)}

    println("--- SetOf ---")
    val funcset = mutableSetOf(joao)
    funcset.forEach{println(it)}

    println("--- Add ---")
    funcset.add(maria)
    funcset.add(pedro)
    funcset.forEach{println(it)}

}
