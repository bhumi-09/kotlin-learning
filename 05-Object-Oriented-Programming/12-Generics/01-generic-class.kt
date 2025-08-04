// Generics let you define classes, functions, and interfaces that can work with any data type, while still being type-safe.

//  Instead of writing the same logic for every type (like Int, String, etc.), you use type parameters like <T>.

//// A generic class that holds any type of value

class Box<T>(val value: T) {
    fun getValues(): T {
        return value
    }
}

fun main() {
    val intBox = Box(123)           // T = Int
    val stringBox = Box("Kotlin")   // T = String

    println(intBox.getValues())      // Output: 123
    println(stringBox.getValues())   // Output: Kotlin
}