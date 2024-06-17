// https://play.kotlinlang.org/byExample/05_Collections/03_Map

// Collections - Maps (chave - valor)
/*
    Um mapa é uma coleção de pares chave/valor, onde cada chave é única e é usada para recuperar o valor correspondente.
    Para criar mapas, existem funções mapOf() e mutableMapOf(). Usar a função to infix torna a inicialização menos barulhenta.
    Uma visualização somente leitura de um mapa mutável pode ser obtida convertendo-o em Map.
 */

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // 2

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {                                        // 3
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // 4
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {                                                              // 5
            k, v -> println("ID $k: credit $v")
    }
}

fun main() {
    accountsReport()                                                                    // 6
    updatePointsCredit(1)                                                               // 7
    updatePointsCredit(3)
    updatePointsCredit(3)
    updatePointsCredit(5)                                                               // 8
    accountsReport()                                                                    // 9
}