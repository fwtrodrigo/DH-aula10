package exercicios.ex1

class Pessoa(private val nome: String, private val rg: Int) {
        override fun equals(other: Any?): Boolean {
        return other is Pessoa && rg == other.rg
    }
}

fun main() {
    val p1 = Pessoa("Rodrigo", 433033412)
    val p2 = Pessoa("Rodrigo", 433033412)

    println(p1 == p2)
    println(p2.equals(p1))
}