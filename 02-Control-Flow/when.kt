fun main(){

    // Returns a string assigned to the dayName variable
    val day = 3;
    
    val dayName = when(day){
        1-> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        else -> "Weekend"
    }
    println(dayName)


    // Returns nothing but triggers a print statement
    val x = 1
    when (x) {
       1 -> print("x == 1")
       2 -> print("x == 2")
        // else -> print("x is neither 1 nor 2")
    }
}