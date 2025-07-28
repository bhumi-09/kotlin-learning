// Companion Object Implementing Interface


// Define a generic interface with a create() method
interface Factory<T> {
    fun create(): T
}

// Class Car with a companion object that implements Factory<Car>
class Cars {
    companion object : Factory<Cars> {
        override fun create(): Cars {
            println("Creating a new Car object...")
            return Cars()
        }
    }

    fun drive() {
        println("Car is driving")
    }
}

fun main() {
    
    // Create Car using the factory method
    val myCar = Cars.create()
    myCar.drive()
}
