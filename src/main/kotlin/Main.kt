fun main(args: Array<String>) {
    println("Enter operation: ")
    var operation:String = readLine()!!
    if(operation == "+") {
        println("Enter number 1: ")
        var num1: Int = readLine()!!.toInt()
        println("Enter number 2: ")
        var num2: Int = readLine()!!.toInt()
        println(num1 + num2)
    }else if(operation == "-"){
        println("Enter number 1: ")
        var num1: Int = readLine()!!.toInt()
        println("Enter number 2: ")
        var num2: Int = readLine()!!.toInt()
        println(num1 - num2)
    }else if(operation == "*"){
        println("Enter number 1: ")
        var num1: Int = readLine()!!.toInt()
        println("Enter number 2: ")
        var num2: Int = readLine()!!.toInt()
        println(num1 * num2)
    }else if(operation == "/") {
        println("Enter number 1: ")
        var num1: Int = readLine()!!.toInt()
        println("Enter number 2: ")
        var num2: Int = readLine()!!.toInt()
        println(num1 / num2)
    }else{
        println("You faggot,try doing something possible on earth next time.")
    }
}