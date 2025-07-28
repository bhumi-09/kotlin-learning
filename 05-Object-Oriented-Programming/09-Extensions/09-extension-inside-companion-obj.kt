// Extension Inside Companion Object

class Calculator {
    companion object {
        fun Double.formatTwoDecimal(): String {
            return String.format("%.2f", this)
        }
    }
}

fun main() {

    // We need to access extension inside companion like this
    with(Calculator) {
        println(3.14159.formatTwoDecimal())              // Output: 3.14
    }
}
