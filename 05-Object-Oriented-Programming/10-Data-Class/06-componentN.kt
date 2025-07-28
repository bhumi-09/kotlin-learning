// Using componentN() functions manually

data class Laptop(val brand: String, val price: Int)

fun main() {
    val laptop = Laptop("HP", 55000)

    println("Brand: ${laptop.component1()}")
    println("Price: ${laptop.component2()}")
}
