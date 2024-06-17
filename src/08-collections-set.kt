// https://play.kotlinlang.org/byExample/05_Collections/02_Set

// Conjuntos (sets)
// não são ordenados e não permitem duplicados

/*
    Um conjunto é uma coleção não ordenada que não suporta duplicatas. Para criar conjuntos,
    existem as funções setOf() e mutableSetOf(). Uma visualização somente leitura de um conjunto mutável
    pode ser obtida convertendo-o em Set.
 */

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)  // 2 - Se não existir igual adiciona, se existir, não adiciona. O retorno é boolean informando se adicionou ou não
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // 3
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                              // 4
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // 5
}