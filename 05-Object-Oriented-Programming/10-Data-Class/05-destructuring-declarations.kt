// Destructuring Declarations

data class Coordinates(val x: Int, val y: Int)

fun main() {
    val point = Coordinates(10, 20)

    // Destructuring into variables
    val (a, b) = point

    println("X-Coordinate: $a")
    println("Y-Coordinate: $b")
}
