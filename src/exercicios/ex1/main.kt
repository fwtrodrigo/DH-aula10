package exercicios.ex1

class Pessoa1(private val nome: String, private val rg: Int) {
        override fun equals(other: Any?): Boolean {
        return other is Pessoa1 && rg == other.rg
    }
}

class Pessoa2(private val nome: String, private val rg: Int) {
    override fun equals(other: Any?): Boolean {
        return other is Pessoa2 && nome == other.nome
    }
}



fun main() {
    val p1 = Pessoa1("Rodrigo", 433033412)
    val p2 = Pessoa1("Rodrigo", 433033412)

    println(p1 == p2)
    println(p2.equals(p1))

    val p3 = Pessoa2("Rodrigo", 433033412)
    val p4 = Pessoa2("Rodrigo", 433033412)

    println(p3 == p4)
    println(p4.equals(p3))

}