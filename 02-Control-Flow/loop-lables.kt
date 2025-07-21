//1. return – From a function

fun greet(name: String) {
    if (name.isEmpty()) {
        return  // exits the function if name is empty
    }
    println("Hello, $name!")
}

fun main() {
    greet("Bhumika")
    greet("")  // Nothing will be printed
}


// 2. break – Exit the loop

fun breakLabel() {
    for (i in 1..5) {
        if (i == 3) {
            break  // loop ends when i is 3
        }
        println(i)
    }
    println("Loop ended")
}


// 3. continue – Skip iteration

fun continueLabel() {
    for (i in 1..5) {
        if (i == 3) {
            continue  // skips 3
        }
        println(i)
    }
}


// 4. Using return, break, and continue with labels

fun breakWithLable() {
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (j == 2) break@outer
            println("i = $i, j = $j")
        }
    }
}
