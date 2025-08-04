 // Use case scenarios
 // State Management in UI Applications

sealed class UiState

object Loadings : UiState()
class SuccessData(val data: String) : UiState()
class ErrorData(val message: String) : UiState()

fun showUi(state: UiState) {
     when (state) {
        is Loadings -> println(" Loading data, please wait...")
        is SuccessData -> println(" Data loaded successfully: ${state.data}")
        is ErrorData -> println(" An error occurred: ${state.message}")
    }
}

// Simulate a use case with different UI states
fun main() {
    val currentState1: UiState = Loadings
    val currentState2: UiState = SuccessData("List of Users")
    val currentState3: UiState = ErrorData("Failed to fetch data")

    showUi(currentState1)
    showUi(currentState2)
    showUi(currentState3)
}