class Rectangle(val side: Int) {
    fun around(): Int {
        return side * 4
    }

    fun area(): Int {
        return side * side
    }
}

fun main() {
    val r1 = Rectangle(4)
    val r2 = Rectangle(2)
    val r3 = Rectangle(6)

    println(r1.around())
    println(r1.area())

    println(r2.around())
    println(r2.area())

    println(r3.around())
    println(r3.area())
}