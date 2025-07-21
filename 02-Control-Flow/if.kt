
fun main(){
    val age = 18
    if (age >= 18) {
        println("You are an adult")
    } else {
        println("You are a minor")
    }

    //max
    var a = 10
    var b = 20

    var max = a
    if (a < b) max = b
    println("max is $max")

    
    // With else
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("max is $max")
}