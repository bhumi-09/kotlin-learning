// open     -> allow a class or function to be inherited or overridden.
// :        -> create a child class.
// super    -> Refers to the parent class
// override -> Used to override functions or properties of parent class


//Superclass (Parent)
open class Animal{
   
    init{
        println("In animal class")
    }
    open fun makeSound(){
        println("Animals make sound")
    }
}

//Subclass (Child)
class Dog : Animal(){

    init{
        println("In dog class")
    }
  
    override fun makeSound(){
        println("Dogs bark!!")
    }
}

fun main(){

    // val obj1 = Animal()
    val obj2 = Dog()

    // obj1.makeSound()
    obj2.makeSound()
}