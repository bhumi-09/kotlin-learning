// A singleton ensures a class has only one instance and provides a global point of access to it.

object MySingleton {
    fun showMessage() {
        println("Hashcode: ${this.hashCode()}")
    }
}

fun main() {
    val obj1 = MySingleton
    val obj2 = MySingleton

    obj1.showMessage()
    obj2.showMessage()

    // Compare references
    println("Are both references same? ${obj1 === obj2}")            // true
}
