//readLine() always returns a String?

fun main(){

    //Taking string input
    print("Enter your name: ")
    val name = readLine()

     //Taking integer input
    print("Enter your age: ")
    val age  = readLine()?.toIntOrNull()     // Returns null instead of throwing an exception if the string is not a valid number.

     //Taking float/double input
    print("Enter your height (in cm): ")
    val height = readLine()?.toDouble()

    //Displaying output
    println("Name: $name")
    println("Age: $age")
    println("Height: $height")

    println(age!!::class)

}