

class Parking(val maxNumberOfCars: Int = 19,
              val price: Double = 15.5,
              val area: Double = 150.8,
              val place: String = "nearTheSupermarket",
              newCars: List<Car> = emptyList()) {

    private val cars: MutableList<Car> = mutableListOf()

    init {
        if (newCars.size > maxNumberOfCars) {
            var index: Int = 0
            while (index != maxNumberOfCars) {
                cars.add(newCars[index])
                cars[index].owner.money -= price
                index++
            }
        } else {
            for (car: Car in newCars) {
                cars.add(car)
                car.owner.money -= price
            }
        }
    }

    fun addCar(car: Car) {

        if (cars.size < maxNumberOfCars){
            cars.add(car)
            println("Машина добавлена")
            car.owner.money -= price
        } else println ("Машина не добавлена")
    }

    fun removeCar(car: Car) {

        for (temp in cars) {
            if (car == temp){
                cars.remove(car)
                println("Машина удалена")
                return
            }
        }
        println("Машины нет")
    }

    fun printCars() {
        for (car in cars) {
            println(car)
        }
    }
}

