// https://play.kotlinlang.org/byExample/05_Collections/05_existential

// any e variações

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
    val anyNegative = numbers.any { it < 0 }             // 2
    val anyGT6 = numbers.any { it > 6 }                  // 3

    val allEven = numbers.all { it % 2 == 0 }            // 2
    val allLess6 = numbers.all { it < 6 }                // 3

    val allEven_2 = numbers.none { it % 2 == 1 }           // 2
    val allLess6_2 = numbers.none { it > 6 }               // 3

    println("Numbers: $numbers")
    println("Is there any number less than 0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")

    println("Numbers: $numbers")
    println("All numbers are even: $allEven")
    println("All numbers are less than 6: $allLess6")

    println("Numbers: $numbers")
    println("All numbers are even: $allEven_2")
    println("No element greater than 6: $allLess6_2")
}