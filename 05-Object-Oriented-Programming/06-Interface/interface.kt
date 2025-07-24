// An interface in Kotlin defines a contract—a set of properties and methods a class must implement.

interface Animals{

    fun makeSound()                     // abstract and must be overridden.

    fun eats(){                          // default implementation.
        println("Eating food")
    }
}

class Dogs : Animals{

    override fun makeSound(){
        println("Dogs says: Woof!")
    }
}

fun main(){
  
    val dog = Dogs()
    dog.makeSound()
    dog.eats()
}