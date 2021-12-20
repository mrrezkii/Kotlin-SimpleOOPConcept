abstract class Vehicle{
    abstract fun type()
    fun driver(){
        println("Driven by Rezki")
    }
}

class Car: Vehicle(){
    override fun type() {
        println("This in car")
    }

}

class Truck: Vehicle(){
    override fun type() {
        println("This is Truck")
    }
}

fun main(){
    Car().type()
    val truck = Truck()
    truck.type()
    truck.driver()
}