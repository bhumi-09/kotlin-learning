// API request-response handling


sealed class ApiResponse

data class SuccessResponse(val data: String) : ApiResponse()
data class ErrorResponse(val errorMessage: String) : ApiResponse()
object LoadingState : ApiResponse()

// Function to simulate API request handling
fun handleApiResponse(response: ApiResponse) {
    when (response) {
        is SuccessResponse -> println(" API Success: ${response.data}")
        is ErrorResponse -> println(" API Error: ${response.errorMessage}")
        LoadingState -> println(" API is loading, please wait...")
    }
}

fun main() {
    val loadingResponse: ApiResponse = LoadingState
    val successResponse: ApiResponse = SuccessResponse("User profile fetched successfully!")
    val errorResponse: ApiResponse = ErrorResponse("Unable to reach server")


    handleApiResponse(loadingResponse)
    handleApiResponse(successResponse)
    handleApiResponse(errorResponse)
}
