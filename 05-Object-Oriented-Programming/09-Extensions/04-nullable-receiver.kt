// Nullable receiver -> define extensions on nullable types and handle null safely.

fun String?.lengthOrZero(): Int{
    return this?.length ?: 0
}

fun main(){

    val str: String? = "Bhumika"
    println(str.lengthOrZero())
}