package exercicios.ex4

fun main() {
    val a1 = Funcionario(nome = "Rodrigo", id = 123)
    val a2 = Funcionario(nome = "Freitas", id = 321)
    val a3 = Funcionario(nome = "Goncalves", id = 444)
    val a4 = Funcionario(nome = "Jhonson", id = 234)

    val funcionarios = listOf(a1, a2, a3, a4)

    val a5 = Funcionario(nome = "Birulira", id = 234)

    println(funcionarios.contains(a5))
}
