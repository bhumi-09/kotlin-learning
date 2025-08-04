// out – Covariance (Produces values)
// Used when a generic class only returns (produces) T.

// Ensures type safety for read-only generic types.


class Producer<out T>(private val item: T) {
    fun produce(): T = item
}

fun main() {
    val stringProducer: Producer<String> = Producer("Kotlin")       // Number also allowed instead of string "Kotling"
    val anyProducer: Producer<Any> = stringProducer                 //  Allowed due to 'out'

    println(anyProducer.produce())                                  
}



// out = you can take out the value.
// Producer<out T> means Producer<String> can be assigned to Producer<Any>