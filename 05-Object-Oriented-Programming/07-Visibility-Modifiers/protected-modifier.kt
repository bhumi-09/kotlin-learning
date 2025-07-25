// Protected – Accessible in the class and subclasses only

open class Parent{

    protected fun greet(){
        println("Hello from parent")
    }
}

//subclass
class Child : Parent(){

    fun callGreet(){
        greet()                     //  Accessible inside subclass
    }
}

fun main(){

    val obj = Child()
    obj.callGreet()
    // obj.greet()                    ERROR ->  Cannot access 'greet': it is protected in 'Child'
}