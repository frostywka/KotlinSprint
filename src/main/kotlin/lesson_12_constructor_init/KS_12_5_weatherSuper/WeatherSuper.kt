package org.example.lesson_12_constructor_init.KS_12_5_weatherSuper

/*
теперь она должна рассчитывать средние значения температур и считать количество дней с осадками за месяц.

Представь, что данные ты получаешь от датчиков. Сымитируй их поведение с помощью random.

- в функции main() создай список и добавь в него с помощью цикла 30 объектов класса,
 передав в конструкторы случайные значения;
- извлеки из списка дневные и ночные температуры, используя функцию map,
 а также посчитай количество дней с осадками;
- вычисли средние значения дневных и ночных температур с помощью
специальной extension-функции из стандартной библиотеки;
- посчитай количество дней с осадками.

Выведи результаты в консоль.
 */

const val QUANTITY = 30

data class WeatherSuper(var daysTemp: Int, var nightsTemp: Int, val weatherPrecipitation: Boolean)

fun main() {

    val listOfWeather = mutableListOf<WeatherSuper>()

    for (i in 1..QUANTITY) {
        var tempDay = (1..40).random()
        var tempNight = (1..40).random()
        var isPrecip = listOf(true, false).random()
        val weatherSuper = WeatherSuper(tempDay, tempNight, isPrecip)
        listOfWeather.add(weatherSuper)
    }

    listOfWeather.forEach {
        println(it)
    }
}