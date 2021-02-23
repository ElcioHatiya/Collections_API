package elcio_collections

data class Funcionario  (
    val nome:String,
    val salario:Int,
    val tipo:String     )
{
    override fun toString(): String =
        """
            Nome:   $nome
            Salário:$salario
            Tipo:   $tipo
            ----------
        """.trimIndent()
}