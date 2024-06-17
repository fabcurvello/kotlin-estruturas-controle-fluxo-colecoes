// https://play.kotlinlang.org/byExample/02_control_flow/01_When

// When Expression -  a val result recebe uma atribuição com when
fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass2()))
}
// função recebe any e retorna any (qualquer coisa)
fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}

class MyClass2

