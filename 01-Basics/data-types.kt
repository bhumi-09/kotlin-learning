
fun main(){
    val num = 5               // Int
    val doubleNum = 5.99      // Double
    val letter = 'D'          // Char
    val boolean = true        // Boolean
    val text = "Hello"        // String

    println("Int: $num")
    println("Doule: $doubleNum")
    println("Char: $letter")
    println("Boolean: $boolean")
    println("String: $text")

    println();
    /// Numbers
    //Integer types

    //1. Byte
    val byteNum: Byte = 100
    println("Byte: $byteNum")

    //2. Short    -->  store whole numbers from -32768 to 32767
    val shortNum: Short = 5000
    println("short: $shortNum")

    //3. Int      --> store whole numbers from -2147483648 to 2147483647
    val intNum: Int = 100000
    println("Int: $intNum")

    //4. Long     --> store whole numbers from -9223372036854775808 to 9223372036854775807 || end the value with an "L"
    val longNum: Long = 15000000000L
    println("Long: $longNum")


    println()
    //Floating Point Types

    //1. Float
    val floatNum: Float = 5.75F
    println("Float: $floatNum")

    //2. Double
    val DoubleNum: Double = 19.99
    println("Double: $DoubleNum")

    println()

    ///Boolean
    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   
    println(isFishTasty)   

     println()

     ///Characters
    val myGrade: Char = 'B'
    println(myGrade)

    println()

    ///Strings
    val myText: String = "Hello World"
    println(myText)
}