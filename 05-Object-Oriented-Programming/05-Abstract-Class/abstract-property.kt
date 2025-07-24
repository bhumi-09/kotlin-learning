// An abstract class is a class that cannot be instantiated on its own 
// Used as a base class for other classes to inherit from and enforce implementation of required behaviors.

// Abstract Class with  Abstract Properties

abstract class Shape{

    // Abstract Properties
    abstract val name : String
    abstract val sides : Int

}

class Triangle : Shape(){

    override val name = "Triangle"
    override val sides = 3
}

class Square : Shape(){

    override val name = "Square"
    override val sides = 4
}

fun main(){

    val objTriangle = Triangle()
    println("Shape: ${objTriangle.name}, Sides: ${objTriangle.sides}")

    val objSquare = Square()
    println("Shape: ${objSquare.name}, Sides: ${objSquare.sides}")
}