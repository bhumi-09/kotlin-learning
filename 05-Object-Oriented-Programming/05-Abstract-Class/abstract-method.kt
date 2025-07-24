// Abstract Class with Abstract and Concrete Methods

abstract class Printer{

    abstract fun printDocument()                    // abstract method

    open fun connectPrinter(){                      // concrete method
        println("Connecting to the printer..")
    }
}

class LaserPrinter : Printer(){

     override fun printDocument(){
        println("Printing document using Laser Printer.")
    }
}

fun main(){
    
    val printerObj = LaserPrinter()
    printerObj.connectPrinter()
    printerObj.printDocument()
}