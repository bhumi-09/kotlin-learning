abstract class PaymentGateway{

    abstract val gatewayName : String                     // abstract property
    abstract fun processPayment(amount : Double)          // abstract method

     fun showGateway() {                                  // Concrete method
        println("Processing payment via $gatewayName gateway.")
    }
}

class RazorPay : PaymentGateway(){

    override val gatewayName = "RazorPay"

    override fun processPayment(amount: Double){
        println("Paid Rs.$amount successfully via $gatewayName.")
    }
}

class Paytm : PaymentGateway(){

    override val gatewayName = "Paytm"

    override fun processPayment(amount: Double){
        println("Paid Rs.$amount successfully via $gatewayName.")
    }
}

fun main(){

    val razorPayObj = RazorPay()
    razorPayObj.showGateway()
    razorPayObj.processPayment(500.0)

    println()

    val paytmObj = Paytm()
    paytmObj.showGateway()
    paytmObj.processPayment(750.0)
}