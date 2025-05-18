package org.example.lesson_17_setters_getters

class BabelFish (
    private val coefficient: Int?
    ) {
    var isTranslated = false

    var nerveSignalLevel = 200
        get() = if (coefficient != null) field * coefficient else field
        //        get() = field
//        get() = 250 // и тогда будет отображаться 250
        set(value) {
            field = 700
//            field = value
            if (value > 300) {
                isTranslated = true
                println("isTranslated = true")
            }
        }
}

fun main() {

    val fish = BabelFish(null)

    println("old value: ${fish.nerveSignalLevel}")
//    println("old value: ${fish.isTranslated}")
//    fish.nerveSignalLevel = 400
//    println("new value: ${fish.nerveSignalLevel}")
//    println("new value: ${fish.isTranslated}")

    val fish1 = BabelFish(1)
    println("old value: ${fish1.nerveSignalLevel}")

    val fish2 = BabelFish(21)
    println("old value: ${fish2.nerveSignalLevel}")

}