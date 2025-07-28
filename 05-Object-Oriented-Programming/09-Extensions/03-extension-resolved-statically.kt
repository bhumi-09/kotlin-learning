// Extensions are resolved statically
// Extensions are not virtual, meaning they are resolved based on the declared type, not the runtime type.

fun main(){
    open class Shapes
    class Circles : Shapes()

    fun Shapes.describe() = "This is a Shape"
    fun Circles.describe() = "This is a Circle"

    fun printDescription(shapes: Shapes){
        println(shapes.describe())
    }

    val shape = Shapes()
    val circle = Circles()

    printDescription(shape)   // Output: This is a Shape
    printDescription(circle)  // Output: This is a Shape (important!)
}

