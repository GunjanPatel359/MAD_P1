tailrec fun factorial(x:Int,y:Int=1):Any {
    return if(x==1) y else factorial(x-1,y*x)
}

fun main() {
    print("Enter a number: ")
    val number = readlnOrNull()?.toIntOrNull() ?: 0
    val fact=factorial(number)
    print(fact)
}
