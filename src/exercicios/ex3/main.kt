package exercicios.ex3

fun main() {
    val a1 = Aluno(nome = "Rodrigo", id = 123)
    val a2 = Aluno(nome = "Freitas", id = 321)
    val a3 = Aluno(nome = "Goncalves", id = 444)
    val a4 = Aluno(nome = "Jhonson", id = 234)

    val alunos = listOf(a1, a2, a3, a4)

    val a5 = Aluno(nome = "Birulira", id = 234)

    println(alunos.contains(a5))

}