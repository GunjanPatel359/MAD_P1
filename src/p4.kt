fun main() {
    println("Enter the number")
    var a:Int=readLine()?.toInt()!!
//     a=readLine()!!.toInt()
    println(if(a%2==0){
        "$a even number"
    }else{
        "$a odd number"
    })
}

