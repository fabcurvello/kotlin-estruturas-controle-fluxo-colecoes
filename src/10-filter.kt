// https://play.kotlinlang.org/byExample/05_Collections/04_filter

// filter
/*
A função de filtro permite filtrar coleções. É necessário um predicado de filtro como parâmetro lambda.
O predicado é aplicado a cada elemento. Os elementos que tornam o predicado verdadeiro são retornados na
coleção de resultados.
 */

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

    val positives = numbers.filter { x -> x > 0 }  // 2

    val negatives = numbers.filter { it < 0 }      // 3

    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")
}