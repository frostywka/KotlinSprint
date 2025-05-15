package org.example.lesson_15_interface_abstract

interface Movable {
    fun moveToPointA()
    fun moveToPointB()
}

interface PassengerTransportation {
    fun uploadingPassengers()
    fun unloadingPassengers()
}

interface CargoTransportation {
    fun uploadingCargo()
    fun unloadingCargo()
}

class CargoTruck(val countPassengers: Int, val countCargo: Int) : Movable, PassengerTransportation,
    CargoTransportation {
    override fun moveToPointA() {
        println("Доехать до точки А")
    }

    override fun moveToPointB() {
        println("Доехать до точки Б")
    }

    override fun uploadingPassengers() {
        println("Загрузка $countPassengers пассажиров")
    }

    override fun unloadingPassengers() {
        println("Высадка $countPassengers пассажиров")
    }

    override fun uploadingCargo() {
        println("Погрузка $countCargo тонны груза ")
    }

    override fun unloadingCargo() {
        println("Разгрузка $countCargo тонны груза")
    }

}

class PassengerCars(val countPassengers: Int) : Movable, PassengerTransportation {
    override fun moveToPointA() {
        println("Доехать до точки А")
    }

    override fun moveToPointB() {
        println("Доехать до точки Б")
    }

    override fun uploadingPassengers() {
        println("Загрузка $countPassengers пассажиров")
    }

    override fun unloadingPassengers() {
        println("Высадка $countPassengers пассажиров")
    }
}

fun main() {
    val cargoTruckOne = CargoTruck(1, 2)
    cargoTruckOne.moveToPointA()
    cargoTruckOne.uploadingCargo()
    cargoTruckOne.uploadingPassengers()
    cargoTruckOne.moveToPointB()
    cargoTruckOne.unloadingCargo()
    cargoTruckOne.unloadingPassengers()
    println("")

    val passengerCarsOne = PassengerCars(3)
    passengerCarsOne.moveToPointA()
    passengerCarsOne.uploadingPassengers()
    passengerCarsOne.moveToPointB()
    passengerCarsOne.unloadingPassengers()
    println("")

    val passengerCarsTwo = PassengerCars(2)
    passengerCarsTwo.moveToPointA()
    passengerCarsTwo.uploadingPassengers()
    passengerCarsTwo.moveToPointB()
    passengerCarsTwo.unloadingPassengers()
}