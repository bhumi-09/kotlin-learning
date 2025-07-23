// Hierarchical Inheritance -> Multiple subclasses inherit from the same superclass

open class Employee{

    fun work(){
        println("Working")
    }
}

class Developer : Employee()

class Tester : Employee()

fun main(){

    val dev = Developer()
    val tester = Tester()

    dev.work()
    tester.work()
}