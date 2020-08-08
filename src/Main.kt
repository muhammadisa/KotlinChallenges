import java.util.*

fun staircaseLeft(stair: Int){
    var str = "#"
    for (i in 0 until stair) {
        println(str)
        str += "#"
    }
}

fun staircaseRight(stair: Int) {
    var str = "#"
    for (i in 0 until stair) {
        System.out.printf("%"+stair+"s\n", str)
        str += "#"
    }
}

fun miniMaxSum(arr: Array<Long>) {
    var intPool: MutableList<Long> = arr.toMutableList()
    val intPoolReversed: MutableList<Long> = arr.reversed().toMutableList()
    val result: ArrayList<Long> = arrayListOf()
    intPoolReversed.forEach { i ->
        intPool.remove(i)
        result.add(intPool.sum())
        intPool = arr.toMutableList()
    }
    println("${result.min()}, ${result.max()}")
}

fun fizzBuzz(start: Int, end: Int) {
    println((start..end).map { i ->
        mapOf(
            0 to i,
            i % 3 to "Fizz",
            i % 5 to "Buzz",
            i % 15 to "Fizz Buzz"
        )[0]
    })
}

fun isPalindrome(str: String) {
    val reversed = str.toCharArray().reversed()
    val original = str.toCharArray().toList()
    if (reversed == original) {
        println("Palindrome")
    } else {
        println("Not Palindrome")
    }
}

fun isAnagram(string1: String, string2: String) {
    if (string1.length == string2.length) {
        val anagram = Arrays.equals(
            string1.chars().sorted().toArray(),
            string2.chars().sorted().toArray()
        )
        if (anagram) {
            println("Anagram")
        } else {
            println("Not Anagram")
        }
    }
}

fun <T> findDuplicate(arr: Array<T>) {
    for (i in 0..arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) {
                println("Duplicate is $j")
            }
        }
    }
}

fun main(args: Array<String>) {
    fizzBuzz(1, 100)
    isPalindrome("abba")
    isAnagram("listen", "silent")
    findDuplicate(arrayOf(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10))
    miniMaxSum(arrayOf(793810624, 895642170, 685903712, 623789054, 468592370))
    staircaseLeft(8)
    staircaseRight(8)
}