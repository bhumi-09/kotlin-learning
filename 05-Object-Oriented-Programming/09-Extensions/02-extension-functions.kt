// These are functions defined outside a class, but called as if they were part of that class.

fun Int.square(): Int{

    return this * this
}

fun main(){

    println(6.square())
}