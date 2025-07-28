// Companion Object Extensions -> extend companion objects just like classes.

class MyCompanionClass{

    companion object
}

fun MyCompanionClass.Companion.greet(){
    println("Hello from companion greet")
}

fun main(){
    MyCompanionClass.greet()
}