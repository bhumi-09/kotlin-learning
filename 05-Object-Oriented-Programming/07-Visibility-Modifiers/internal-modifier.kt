//  Internal – Accessible within the same module:

internal class InternalModifier{

    internal fun speak(){
        println("Speaking internally")
    }
}

fun main(){
    val obj = InternalModifier()
    obj.speak()                             // Accessible within the same module
}