package org.example.lesson_15_interface_abstract

interface Movable{
    fun moveToPointA(){
        println("Доехать до точки А")
    }

    fun moveToPointB(){
        println("Доехать до точки Б")
    }
}

interface PassengerTransportation{
    fun uploadingPassengers(){
        println("Загрузка пассажиров")
    }

    fun unloadingPassengers(){
        println("Высадка пассажиров")
    }
}
interface CargoTransportation{
    fun uploadingCargo(){
        println("Погрузка груза")
    }

    fun unloadingCargo(){
        println("Разгрузка груза")
    }
}

class CargoTruck(val countPassengers: Int, val countCargo: Int): Movable, PassengerTransportation, CargoTransportation
class PassengerCars(val countPassengers: Int, val countCargo: Int = 0): Movable, PassengerTransportation

fun main() {
    val cargoTruckOne = CargoTruck(1,2)
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