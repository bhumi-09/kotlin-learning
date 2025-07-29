// A sealed class restricts which classes can inherit from it.
// All subclasses must be declared in the same file.
// Used for type-safe representation of restricted hierarchies (common in when expressions).

sealed class Result

class Success(val data: String) : Result()
class Error(val errorMessage: String) : Result()
object Loading : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> println("Data: ${result.data}")
        is Error -> println("Error: ${result.errorMessage}")
        Loading -> println("Loading...")
    }
}

fun main() {
    val result: Result = Success("Data fetched successfully!")
    handleResult(result)
}
