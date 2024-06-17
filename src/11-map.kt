// https://play.kotlinlang.org/byExample/05_Collections/04_map

// Função map
/*
    A função de extensão de mapa permite aplicar uma transformação a todos os elementos de uma coleção.
    É necessária uma função de transformador como parâmetro lambda.
 */

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numbers.map { x -> x * 2 }      // 2

    val tripled = numbers.map { it * 3 }          // 3

    println("Numbers: $numbers")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")
}