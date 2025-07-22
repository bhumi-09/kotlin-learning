//Functions defined inside another function.
//Only accessible within the outer function 

fun outerFunction(){
    println("In outer function")
   
    fun innerFunction(){
        println("In a local function")
    }

    innerFunction()
}

fun main(){
    outerFunction()
}