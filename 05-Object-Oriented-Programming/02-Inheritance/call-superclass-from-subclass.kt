// Calling Superclass Function from Subclass
// Kotlin does not support multiple inheritance with classes to avoid ambiguity.


open class Vehicle{

    open fun start(){
        println("Vehicle started")
    }
}

class Car : Vehicle(){

    override fun start(){
        super.start()               // Calls parent function
        println("Car started")
    }
}

fun main(){

    val obj = Car();
    obj.start()
}