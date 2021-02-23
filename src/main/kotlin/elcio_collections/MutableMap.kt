package elcio_collections

fun main() {
    val joao =  Funcionario("Joao",5000,"CLT")
    val maria = Funcionario("Maria",2000,"PJ")
    val pedro = Funcionario("Pedro",3000,"CLT")

    val repositorio = Repositorio<Funcionario>()

        repositorio.create(joao.nome, joao)
        repositorio.create(maria.nome,maria)
        repositorio.create(pedro.nome,pedro)

        //println(repositorio.findById(maria.nome))

        repositorio.findAll().forEach{println(it)}



}