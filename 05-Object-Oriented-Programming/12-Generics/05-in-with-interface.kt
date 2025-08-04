// in – Contravariance (Consumes values)
// Used when a generic class only accepts (consumes) T.

// Useful when you're inserting or passing in data.
// in = you can put in the value.


interface Consumer<in T> {
    fun consume(item: T)
}

class StringConsumer : Consumer<String> {
    override fun consume(item: String) {
        println("Consumed: $item")
    }
}

fun main() {
    val stringConsumer: Consumer<String> = StringConsumer()
    val anyConsumer: Consumer<String> = stringConsumer  

    anyConsumer.consume("Hello Kotlin")
}





