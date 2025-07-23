//  Multilevel Inheritance -> A class inherits from another subclass

open class Device{

    init{
        println("In device class")
    }
    
     fun powerOn(){
        println("Device is powered ON")
    }
}
 
open class SmartPhone : Device(){

    init {
        println("In SmartPhone class")
    }

    fun makeCall(){
        println("Making a call from smartphone")
    }
}

class AndroidPhone : SmartPhone(){

    init{
        println( "In AndroidPhone class")
    }

    fun installApp(){
        println("Installed app on Android phone")
    }
}

fun main(){

    val phoneObj = AndroidPhone()
    phoneObj.installApp()
    phoneObj.makeCall()
    phoneObj.powerOn()
}