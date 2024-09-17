fun main(){
    val array7 = IntArray(5)
    array7.forEachIndexed { index, _ ->
        print("a[$index] = ")
        val input = readlnOrNull()?.toIntOrNull() ?: 0
        array7[index] = input
    }
    println(array7.joinToString())
    var max = array7[0]
    for(i in 4 downTo 0){
        if(array7[i]>max){
            max=array7[i]
        }
    }
    println(max)
}