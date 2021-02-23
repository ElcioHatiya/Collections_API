package elcio_collections

fun main() {
    val joao =  Funcionario("Joao",5000,"CLT")
    val maria = Funcionario("Maria",2000,"PJ")
    val pedro = Funcionario("Pedro",3000,"CLT")

    val funcionarios = listOf(joao,maria,pedro)
    funcionarios.forEach{ println(it)}

    //Find
    println("---- Find Maria ----")
    println(funcionarios.find { it.nome == "Maria"})

    //SortedBy
    println("--- .sortedBy Salário ---")
        funcionarios
             .sortedBy { it.salario }
             .forEach  { println(it)}

    //GroupBy
    println("--- .groupBy Tipo ---")
        funcionarios
             .groupBy { it.tipo }
             .forEach  { println(it)}
           }
