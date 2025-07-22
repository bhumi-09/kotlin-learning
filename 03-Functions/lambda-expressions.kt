
fun sum(){
    val sum = {a : Int, b : Int -> a + b}
    println(sum(3, 5)) 
}


//Passing lambda to function
fun calculate(a : Int, b : Int, operation: (Int, Int) -> Int): Int{
    return operation(a , b)
}

fun main(){
    val result = calculate(10, 20) { x, y -> x * y }
    println(result)
}