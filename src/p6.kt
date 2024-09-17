fun operation(num1: Int, num2: Int,num3:Int, operator: Char): Any? {

    when (operator) {
        '+' -> {return num1 + num2 + num3}
        '-' -> {return num1 - num2 - num3}
        '*' -> {return num1 * num2 * num3}
        '/' -> {
            if (num2 == 0) {
                println("cannot divide by zero")
                return null
            }
            return num1.toFloat() / num2
        }
        else -> {
            println("Invalid operator")
            return null
        }
    }
}

fun main() {
    val num1=111
    val num2=2222
    val num3=-222

    println("Addition of $num1, $num2, $num3 is ${operation(num1,num2,num3,'+')}")
    println("Subtraction of $num1, $num2, $num3 is ${operation(num1,num2,num3,'-')}")
    println("Multiplication of $num1, $num2, $num3 is ${operation(num1,num2,num3,'*')}")
    println("Division of $num1, $num2 is ${operation(num1,num2,num3,'/')}")
}