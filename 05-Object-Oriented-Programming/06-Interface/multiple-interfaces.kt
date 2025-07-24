// Kotlin supports multiple interface inheritance.
// You must resolve conflicts when multiple interfaces implement the same method.

interface Camera{

    fun takePhoto()
}

interface GPS{

    fun getLocations()
}

class SmartPhones : Camera, GPS{

    override fun takePhoto(){
        println("Photo taken using the camera")
    }

    override fun getLocations(){
          println("Fetching GPS location...")
    }
}

fun main(){

    val obj = SmartPhones()
    obj.takePhoto()
    obj.getLocations()

}