// Extensions allow you to add new functions or properties to existing classes without modifying their source code.

fun String.addHello(): String{
    return "Hello, $this"
}

fun main(){
     
    val name = "Bhumika"
    println(name.addHello())
}