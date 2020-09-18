package exercicios.ex4

class Funcionario(val nome: String, val id: Int) {
    override fun equals(other: Any?): Boolean {
        return other is Funcionario && id == other.id
    }
}
