// Method Overriding (Run-time Polymorphism)
// Subclass overrides the function from the parent class.

open class BankAccount{

    init{
        println("In BankAccount")
    }

    open fun withDraw(amount : Double){
        println("Withdrawing $$amount from Bank Account")
    }
}

class SavingAccount : BankAccount(){

    override fun withDraw(amount : Double){
      val fee = 5.0
        println("Withdrawing $$amount with fee $$fee from Savings Account")
    }
}

class CurrentAccount : BankAccount(){

    override fun withDraw(amount : Double){
       println("Withdrawing $$amount with no fee from Saving Account")
    }
}

fun main(){

    val account1 : BankAccount = SavingAccount()
    val account2 : BankAccount = CurrentAccount()

    account1.withDraw(12000.6)
    account2.withDraw(5500.0)
}