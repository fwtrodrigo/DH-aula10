package exercicios.ex3

class Aluno(private val nome: String, private val id: Int) {
    override fun equals(other: Any?): Boolean {
        return other is Aluno &&  id == other.id
    }
}