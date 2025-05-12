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
        println("Загрузка пассажиров")
    }

    override fun unloadingPassengers() {
        println("Высадка пассажиров")
    }

    override fun uploadingCargo() {
        println("Погрузка груза")
    }

    override fun unloadingCargo() {
        println("Разгрузка груза")
    }

}

class PassengerCars(val countPassengers: Int, val countCargo: Int = 0) : Movable, PassengerTransportation {
    override fun moveToPointA() {
        println("Доехать до точки А")
    }

    override fun moveToPointB() {
        println("Доехать до точки Б")
    }

    override fun uploadingPassengers() {
        println("Загрузка пассажиров")
    }

    override fun unloadingPassengers() {
        println("Высадка пассажиров")
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