package org.example.lesson_14_override_inheritance_openclass.theory.KS_14_4_gameAboutPlanet

open class StellarObject(
    val name: String,
    val isAtmosphere: Boolean,
    val isLandable: Boolean,
    val isPlanet: Boolean,
)

class Planet(
    name: String,
    val satellite: List<Satellite>,
    isAtmosphere: Boolean,
    isLandable: Boolean,
    isPlanet: Boolean = true,
) : StellarObject(name, isLandable, isAtmosphere, isPlanet)

class Satellite(
    name: String,
    isAtmosphere: Boolean,
    isLandable: Boolean,
    isPlanet: Boolean = false
) : StellarObject(name, isLandable, isAtmosphere, isPlanet)

fun main() {

    val io = Satellite("Ио", false, true)
    val ganymede = Satellite("Ганимед", false, true)

    val jupiter = Planet("Юпитер", listOf(io, ganymede), true, false)
    println("Название планеты: ${jupiter.name}; Название спутников: ${jupiter.satellite.map { it.name }}")
}