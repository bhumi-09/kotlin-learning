// Interface for smart devices
interface SmartDevice {
    
    val deviceName: String                      // Abstract property
    fun turnOn()                                // Abstract method
    fun turnOff()                               // Abstract method

    fun getStatus() {                           // Concrete method
        println("$deviceName status: Online")
    }
}

// Class implementing the interface
class SmartLight(override val deviceName: String) : SmartDevice {
    
    override fun turnOn() {
        println("$deviceName is now ON.")
    }

    override fun turnOff() {
        println("$deviceName is now OFF.")
    }
}

class SmartFan(override val deviceName: String) : SmartDevice {
   
    override fun turnOn() {
        println("$deviceName is spinning.")
    }

    override fun turnOff() {
        println("$deviceName is stopped.")
    }
}

fun main() {
   
    val lightObj = SmartLight("Living Room Light")
    val fanObj = SmartFan("Bedroom Fan")

    lightObj.turnOn()
    lightObj.getStatus()
    lightObj.turnOff()

    println()

    fanObj.turnOn()
    fanObj.getStatus()
    fanObj.turnOff()
}
