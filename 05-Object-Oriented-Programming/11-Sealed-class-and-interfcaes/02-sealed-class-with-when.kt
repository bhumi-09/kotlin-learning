//  Using Sealed Classes with when Expression

sealed class Transport

class Taxi(val brand: String) : Transport()

class Bicycle(val gearCount : Int) : Transport()

object Walking : Transport()

// Function that handles all transport types using `when`
fun travel(mode: Transport){
    when (mode){
        is Taxi -> println("Driving a ${mode.brand} taxi")
        is Bicycle -> println("Riding a bicycle with ${mode.gearCount} gears.")
        Walking -> println("Walking to the destination.")
        
    }
}

fun main() {
    val transport1: Transport = Taxi("Toyota")
    val transport2: Transport = Bicycle(21)
    val transport3: Transport = Walking

    travel(transport1)
    travel(transport2)
    travel(transport3)
}

