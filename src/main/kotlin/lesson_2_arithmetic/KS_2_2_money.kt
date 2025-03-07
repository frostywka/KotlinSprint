package org.example.lesson_2_arithmetic

fun main() {

    val workers = 50
    val moneyForWorkers = 30000
    val interns = 20
    val moneyForInterns = 20000

    val sumForWorkersByMonth = workers * moneyForWorkers
    val sumForWorkersAndInters = sumForWorkersByMonth + (interns * moneyForInterns)
    val arithmeticMeanForOneWorkers = sumForWorkersAndInters / (workers + interns)

    println(
        """
        Расчеты произведены за месяц:
        Расходы на выплату зарплаты постоянных сотрудников составили: $sumForWorkersByMonth
        Общие расходы по ЗП после прихода стажеров составили: $sumForWorkersAndInters
        Средняя ЗП одного сотрудника после устройства стажеров составляет(посчитал всех сотрудников): $arithmeticMeanForOneWorkers
    """.trimIndent()
    )
}