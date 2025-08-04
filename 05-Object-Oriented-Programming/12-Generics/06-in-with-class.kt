// in with class

// Consumes T, so we use 'in'
class Consumers<in T> {
    fun consume(item: T) {
        println("Consumed: $item")
    }
}

fun main() {
    val stringConsumer: Consumers<String> = Consumers()
    val anyConsumer: Consumers<String> = stringConsumer         // Allowed due to 'in'

    anyConsumer.consume("Hello Kotlin")                         // Output: Consumed: Hello Kotlin
}
