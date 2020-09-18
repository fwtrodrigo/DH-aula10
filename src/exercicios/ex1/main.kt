package exercicios.ex1

fun main() {
    val p1 = Pessoa("Rodrigo", 433033412)
    val p2 = Pessoa("Rodrigo", 433033412)

    println(p1 == p2)
    println(p2.equals(p1))
}