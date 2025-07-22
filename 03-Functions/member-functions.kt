//Functions defined inside a class.
//Can access class properties and are called using an object.

class Person(val name: String){
    fun sayHello(){
        println("Hello, $name!")
    }
}

fun main(){
    val obj = Person("Bhumika")
    obj.sayHello()
}