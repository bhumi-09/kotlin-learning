// Payment Method Handling using sealed interface

// Defined sealed interface for different payment methods
sealed interface PaymentMethod

// Different payment types that implement the interface
data class CreditCard(val cardNumber: String, val holderName: String) : PaymentMethod
data class UPI(val upiId: String) : PaymentMethod
object Cash : PaymentMethod

// Function to process payment using when-expression
fun processPayment(method: PaymentMethod) {
    when (method) {
        is CreditCard -> println("Processing credit card payment for ${method.holderName}, Card: ${method.cardNumber}")
        is UPI -> println("Processing UPI payment via ID: ${method.upiId}")
        Cash -> println("Payment received in cash.")
    }
}

fun main() {
    val payment1: PaymentMethod = CreditCard("1234-5678-9012-3456", "Alice")
    val payment2: PaymentMethod = UPI("alice@ybl")
    val payment3: PaymentMethod = Cash

    processPayment(payment1)
    processPayment(payment2)
    processPayment(payment3)
}
