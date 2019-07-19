



fun main () {

    val person1 = Person("Алексей Гаврилович")
    val person2 = Person("Алексей Степанович", 125.98)
    val person3 = Person("Алексей Андреевич", 149.90)
    val person4 = Person("Алексей Павлович", -385.44)

    val car1: Car = Car("y254de","Honda", 6.0, person1)
    val car2: Car = Car("u532ej", "Honda", 7.0, person2)
    val car3: Car = Car("u563uj", "Honda", 7.0, person3)
    val carPark: Parking = Parking(maxNumberOfCars = 5, newCars = listOf(car1, car2, car3))

    carPark.addCar(Car("y254dy","Honda", 6.0, person4))

    carPark.printCars()
}