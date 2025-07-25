//  Public (default) – Accessible everywhere

class PublicModifier{

    fun show(){
        println("This is a public function")          // Implicitly public
    }
}

fun main(){

    val obj = PublicModifier()
    obj.show()
}