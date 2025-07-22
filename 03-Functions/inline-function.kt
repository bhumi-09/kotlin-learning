
inline fun doSomething(action: () -> Unit){
    println("Before action")
    action()
    println("After action")
}

fun main(){
    doSomething(){
        println("This is the action!")
    }
}