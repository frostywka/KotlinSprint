package org.example.lesson_14_override_inheritance_openclass.theory

// рабочий файл в кот. можно создать экземпляр и вызвать методы класса
fun main() {

    // название, скорость, беспилотник
    // варп режим, диагностика системы
    // разведчик, индустриальный

     val ship1 = SpaceShip("ship1",500)
    ship1.switchToWarpMode()
    ship1.runSystemDiagnostic()
    println()

    val scout1 = Scout("Scout1", 750, 100, 10000 )
    scout1.switchToWarpMode()
    scout1.runSystemDiagnostic()
    scout1.runAfterburner()
    scout1.handleDataFromRadar()
    println(scout1.unmanned)
    println()

    val industrial = Industrial("Industrial1", 350, 13)
    industrial.switchToWarpMode()
    industrial.runSystemDiagnostic()
    industrial.launchScanningDrones()
    println(industrial.unmanned)

}