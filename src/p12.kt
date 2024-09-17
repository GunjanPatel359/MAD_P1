fun main() {
    var a=10
    var b=20
    println("swapping without third variable")
    println("value of a:$a")
    println("value of a:$b")
    b=a+b
    a=b-a
    b=b-a
    println("after swapping both elements")
    println("value of a:$a")
    println("value of a:$b")

    a=10
    b=20
    println("swapping using third variable")
    println("value of a:$a")
    println("value of a:$b")
    var c=a
    a=b
    b=c
    println("after swapping both elements")
    println("value of a:$a")
    println("value of a:$b")
}


