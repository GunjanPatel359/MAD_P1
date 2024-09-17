fun main() {
    var a:Int=20
    println("Integer value is $a")
    println("Float value is (from Integer) ${a.toFloat()}")
    println("Double value is (from Integer) ${a.toDouble()}")
    println("long value is (from Integer) ${a.toLong()}")
    var b:String="30"
    println("Integer value is (from String) ${b.toInt()}")
    println("Float value is (from String) ${b.toFloat()}")
    println("Double value is (from String) ${b.toDouble()}")
}