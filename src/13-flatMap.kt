// https://play.kotlinlang.org/byExample/05_Collections/12_flatMap

// flatMap

/*
flatMap transforma cada elemento de uma coleção em um objeto iterável e constrói uma única lista dos resultados da
transformação. A transformação é definida pelo usuário.
 */

fun main() {

    val fruitsBag = listOf("apple","orange","banana","grapes")  // 1
    val clothesBag = listOf("shirts","pants","jeans")           // 2
    val cart = listOf(fruitsBag, clothesBag)                    // 3
    val mapBag = cart.map { it }                                // 4
    val flatMapBag = cart.flatMap { it }                        // 5

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")
}