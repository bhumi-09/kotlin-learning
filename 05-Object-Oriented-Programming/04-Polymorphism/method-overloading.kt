// Also called Compile-time Polymorphism
// Same function name with different parameters.

class Cslculator {

    fun add( a : Int,  b: Int): Int{
        return a + b
    }

    fun add(a: Int, b : Int, c : Int): Int{
        return a + b + c
    }
}

fun main(){

    val obj = Cslculator()
    println(obj.add(10, 5))
    println(obj.add(10, 20, 30)) 
}