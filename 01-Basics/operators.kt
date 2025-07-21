fun main() {

    //Arithmetic Operators
    println(" \nArithmetic Operators")
    val a = 10
    val b = 3

    println("Addition: ${a + b}")       
    println("Subtraction: ${a - b}")  
    println("Multiplication: ${a * b}") 
    println("Division: ${a / b}")       
    println("Modulus: ${a % b}")   
    
    
    //Assignmnet Operators
    println(" \nAssignment Operators")
    var x = 5
    
    x += 3   
    println("x after += : $x")

    x -= 2   
    println("x after -= : $x")

    x *= 2   
    println("x after *= : $x")

    x /= 3  
    println("x after /= : $x")

    x %= 3   
    println("x after %= : $x")


    //Comparison Operators
    println(" \nComparison Operators")
    val m = 7
    val n = 10

    println("m == n: ${m == n}")   // false
    println("m != n: ${m != n}")   // true
    println("m > n: ${m > n}")     // false
    println("m < n: ${m < n}")     // true
    println("m >= n: ${m >= n}")   // false
    println("m <= n: ${m <= n}")   // true



     //Logical Operators
    println(" \nLogical Operators")
    val isAdult = true
    val hasID = false

    println("Can Enter (AND): ${isAdult && hasID}") // false
    println("Can Enter (OR): ${isAdult || hasID}")  // true
    println("Not Adult: ${!isAdult}")               // false
}

