package exercicios.ex2

class Coca(private val tamanho: Int, private val preco: Double) {
    override fun equals(other: Any?): Boolean {
        return other is Coca && other.tamanho == tamanho
    }
}
