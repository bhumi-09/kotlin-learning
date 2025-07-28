// Companion objects are used to access methods/properties without creating an object of the class
// a companion object is a way to define members (functions or properties) that belong to the class itself, rather than to instances of the class — similar to static methods in Java.

// A class can have only one companion object.
// Companion object members are accessed using the class name.
// It can implement interfaces or have a name.

class MyClass{

    companion object {
        var companyName = "OpenAI"

        fun greet(){
            println("Welcome to $companyName")
        }
    }
}

fun main(){
    
    // Accessing without creating an object
    println(MyClass.companyName)
    MyClass.greet()
}