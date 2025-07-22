//A recursive function is a function that calls itself to solve a problem.

fun factorial(n : Int) : Int{
    return if (n == 1){
        1
    }else{
        n * factorial(n - 1)        //// function calls itself
    }
}

fun main(){
    val result = factorial(5)
    println("Factorial of 5: $result")
    
}