package exercicios.ex2

class Coca(private val tamanho: Int, private val preco: Double) {
    override fun equals(other: Any?): Boolean {
        return other is Coca && other.tamanho == tamanho
    }
}

fun main() {
    val c1 = Coca(1, 3.3)
    val c2 = Coca(1, 3.3)

    println(c1.equals(c2))
}