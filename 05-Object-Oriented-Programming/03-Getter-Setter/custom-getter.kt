// getters and setters are used to control access to properties.

// val → only getter
// var → getter and setter

// By default, Kotlin generates them automatically, but you can customize them.

class Circle(val radius : Double){
    val area : Double
   
    get(){
       return  3.14 * radius * radius
    }
}

fun main(){

    val c = Circle(5.0)
    println("Area of Circle: ${c.area}")

}