// https://play.kotlinlang.org/byExample/05_Collections/01_List

// List
/*
    Uma lista é uma coleção ordenada de itens. No Kotlin, as listas podem ser mutáveis (MutableList) ou
    somente leitura (List). Para criação de listas, use as funções de biblioteca padrão listOf() para listas
    somente leitura e mutableListOf() para listas mutáveis. Para evitar modificações indesejadas, obtenha
    visualizações somente leitura de listas mutáveis convertendo-as em List.
 */

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
val sudoers: List<Int> = systemUsers                              // 2

fun addSystemUser(newUser: Int) {                                 // 3
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  // 4
    return sudoers
}

fun main() {
    addSystemUser(4)                                              // 5
    println("Tot sudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach {                                     // 7
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!                           // 8
}