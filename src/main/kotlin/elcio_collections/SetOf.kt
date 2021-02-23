package elcio_collections

fun main()  {
    val joao =  Funcionario("Joao",5000,"CLT")
    val maria = Funcionario("Maria",2000,"PJ")
    val pedro = Funcionario("Pedro",3000,"CLT")

    val funcionarios1 = setOf(joao,maria)
    val funcionarios2 = setOf(pedro)

    //Union
    val uniao = funcionarios1.union(funcionarios2)
    uniao.forEach{println(it)}

    //Subtract
    println("--- Subtract ----")
    val funcionarios3 = uniao.subtract(funcionarios2)
    funcionarios3.forEach{ println(it)}

    //Intersect
    println("--- Intersect ----")
    val intersccao = uniao.intersect(funcionarios2)
    intersccao.forEach{ println(it)}

            }