fun main() {
    // Print numbers 1 to 5
    for (i in 1..5) {
        println(i)
    }

    println()

    // Loop through a list
    val fruits = listOf("Apple", "Banana", "Cherry")
    for (fruit in fruits) {
        println(fruit)
    }
    println()

    //Range Variations in for Loop

    // Downward count
    for(i in 5 downTo 1){
        println(i)
    }

    println()
    // Skip every second number
    for(i in 1..10 step 2){
        println(i)
    }

}
