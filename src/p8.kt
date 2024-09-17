fun main() {
    println("making array using arrayOf()")
    val array1 = arrayOf(10,90,60,80,100)
    println("printing array 1 using joinToString")
    println(array1.joinToString())
    println("making array using Array<Int>(){}")
    val array2 = Array<Int>(5){0}
    println("printing array 1 using contentDeepToString")
    println(array2.contentDeepToString())
    val array3 = Array<Int>(8){i -> i}
    println(array3.contentDeepToString())
    println("making array using IntArray()")
    val array4 = IntArray(5)
    println(array4.joinToString())
    println("making array using intArrayOf()")
    val array5 = intArrayOf(12,10,1,5,18,19)
    println(array5.joinToString())
    val array6 = arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(6,7))
    println(array6.contentDeepToString())
    val array7 = IntArray(5)
    array7.forEachIndexed { index, _ ->
        print("a[$index] = ")
        val input = readlnOrNull()?.toIntOrNull() ?: 0
        array7[index] = input
    }
    println(array7.joinToString())
    println("sorting array")
    val sortedArray1=array7.sorted()
    println(sortedArray1.joinToString())
    bubbleSort(array7)
    val array8=intArrayOf(12,10,1,5,18,19)
    println(array8.joinToString())
}

fun bubbleSort(array: IntArray) {
    val n = array.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}