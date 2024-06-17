// https://play.kotlinlang.org/byExample/02_control_flow/02_Loops

// Loops - For

fun main(args: Array<String>) {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }

}