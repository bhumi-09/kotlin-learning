// A data class in Kotlin is a class meant primarily to store data. The compiler automatically provides:

// 1. equals()
// 2. hashCode()
// 3. toString()
// 4. copy()
// 5. componentN() functions (for destructuring)

// Must have at least one parameter in the primary constructor.
// All primary constructor parameters must be marked val or var.
// Cannot be abstract, open, sealed, or inner.


//Example:

// Basic Data Class Declaration + toString()

data class UserDetails(val name: String, val age: Int)

fun main() {
    val user = UserDetails("Bhumika", 24)

    // Automatically calls toString() for a readable format
    println("User info: $user")
}
