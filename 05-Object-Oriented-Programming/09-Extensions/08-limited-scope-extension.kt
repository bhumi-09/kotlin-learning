// Extension Inside a Class (Limited Scope)

class FindSquare {
    fun Int.square(): Int {
        return this * this
    }

    fun useExtension() {
        val num = 4
        println("Square: ${num.square()}")
    }
}

fun main() {
    val obj = FindSquare()
    obj.useExtension()

    // println(5.square())                   Error: square() is not available here
}



// square() is only available inside FindSquare where it is defined.