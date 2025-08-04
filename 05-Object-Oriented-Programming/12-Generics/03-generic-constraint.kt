// Generic Constraints – Limit allowed types
// You can restrict what types can be passed using :

fun <T: Number> addNumbers(a : T, b : T): Double {
    return a.toDouble() + b.toDouble()
}

fun main(){
    println(addNumbers(5, 10))            // Output: 15.0
    println(addNumbers(4.5, 3.5))         // Output: 8.0
    // addNumbers("Kotlin", "Gen")        ERROR: argument type mismatch: actual type is 'String', but 'Number' was expected.
}