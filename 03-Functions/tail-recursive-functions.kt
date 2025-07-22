//	Optimized recursion using tailrec keyword

tailrec fun factorialTail(n : Int, result : Int = 1) : Int{
    
    return if(n == 1) result else  factorialTail(n-1, result * n)
}

fun main(){
    val result = factorialTail(3)
    println("Factorial of 3: $result")
}