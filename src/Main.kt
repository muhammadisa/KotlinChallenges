import java.util.*



fun fizzBuzz(start: Int, end: Int){
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
}