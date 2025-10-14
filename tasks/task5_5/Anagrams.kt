// Task 5.1.1: anagram checking using a function
infix fun String.anagramOf(second: String) = this.lowercase().toList().sorted() == second.lowercase().toList().sorted()

fun main(){
    var first = readln().toString()
    var second = readln().toString()

    if (first anagramOf second) {
        println("$first and $second are anagrams!")
    }
    else{
        println("$first and $second are not anagrams.")
    }
}