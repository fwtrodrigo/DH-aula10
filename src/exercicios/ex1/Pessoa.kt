package exercicios.ex1

class Pessoa(private val nome: String, private val rg: Int) {
    override fun equals(other: Any?): Boolean {
        return other is Pessoa && rg == other.rg
    }
}
