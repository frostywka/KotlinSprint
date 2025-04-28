package org.example.lesson_14_override_inheritance_openclass.theory

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
): SpaceShip(name, speed, unmanned = true)  {

    fun launchScanningDrones(){
        println("$name сканирующие дроны запущены")
    }

    // Переопределим имеющуюся функцию
    // объявить метод в дочернем классе ОБЯЗАТЕЛЬНО с таким же названием
    // В теле функции прописать новое действие
    // изначально нельзя наследоваться от классов и Функций тоже, но 2 действия позволяют это обойти:
    // 1) у Метода, который хотим ПЕРЕОПРЕДЕЛИТЬ, в базовом классе, прописывает OPEN
    // 2) В подклассе дописываем OVERRIDE

    // так же возможно обращение к методам и свойствам супер класса
    // если нужна реализация из класса родителя прописываем через SUPER
    override fun runSystemDiagnostic(){
        super.runSystemDiagnostic()
        println("$name запущена диагностика дронов и майнеров")
    }


}