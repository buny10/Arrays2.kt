fun main() {
 var max = findMax(arrayOf(4,5,6,7,8))
    var min = findMin(arrayOf(2,3,4,5,6))
    println("Maximum value = $max")
    println("Minimum value = $min")
}

fun findMax (numbers: Array<Int>): Int {
    var max = numbers[0]

    for (number in numbers){
        if (number > max)
            max = number
    }
    return max
}

fun findMin (numbers: Array<Int>): Int {
    var min = numbers[0]

    for (number in numbers){
        if (number < min)
            min = number
    }
    return min
}