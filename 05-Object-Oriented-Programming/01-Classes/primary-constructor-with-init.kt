// init block is a special block of code that runs immediately after the primary constructor is called.
// It's used to initialize class properties or execute logic during object creation.
// You can have multiple init blocks, and they run in the order they appear.

class User(val name: String, val age: Int){

    init{
        println("Init Block 1")
    }

    init{
        println("Init Block 2")
    }

    fun greet(){
        println("Hello, $name")
    }

    init{
        println("Init Block 3")
    }
}

fun main(){

    println("Before object creation")
   
    val userObj = User("Bhumika", 22)
    userObj.greet()
   
    println("After object creation")
}