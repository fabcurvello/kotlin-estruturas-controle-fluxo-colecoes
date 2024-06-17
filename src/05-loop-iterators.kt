//https://play.kotlinlang.org/byExample/02_control_flow/02_Loops

// Loop - Iterators

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> { // 1 - Operador de funçao iterator. Permite que a classe seja iterável (percorrida por uma estrutura de repetição)
        return animals.iterator()               // 2 - Permite iterar a lista de animais ( do construtor da classe Zoo )
    }
}

fun main() {

    val animals = listOf(Animal("zebra"), Animal("lion")) // lista de animais
    val zoo = Zoo(animals)

    for (animal in zoo) { // 3 - For percorre zoo (o que retorna do iterator)
        println("Watch out, it's a ${animal.name}")
    }

}