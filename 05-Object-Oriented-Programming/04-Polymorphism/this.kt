// this -> Used to refer to the current object

class Order(val product : String){
    var quantity : Int = 1

    init{
        println("Order placed for $product ")
    }

    fun update(quantity : Int){
          // `this.quantity` refers to class property, `quantity` is parameter
          this.quantity = quantity
    }

    fun confirmOrder(){

        // confirm is just a lambda function stored in a variable and then invoked

        val confirm = {
             println("Confirming order for ${this.product} with quantity $quantity")  // `this` inside lambda refers to enclosing class
        }

        confirm()
    }
}

fun main(){

    var order = Order("Headphones")
    order.update(20)
    order.confirmOrder()

    order.quantity = 5
    order.confirmOrder()
}