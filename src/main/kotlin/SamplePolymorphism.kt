// Overriding
open class Animal {
    open fun sound() {
        println("Whuzz")
    }

    fun eat() {
        println("nyam-nyam")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Guk guk")
    }
}

// Overloading

fun showNim(value: String) {
    println(value)
}

fun showNim(value: Int) {
    println(value)
}

fun main() {
    val dog = Dog()
    dog.sound()
    dog.eat()

    showNim("1202190044")
    showNim(1202190044)
}



