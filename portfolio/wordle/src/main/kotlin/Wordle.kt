// Implement the six required functions here
import java.io.File

fun isValid(word: String): Boolean{
    if (word.length == 5){
        return true
    }
    else{
        return false
    }
}

fun readWordList(filename: String): MutableList<String>{
    var words: MutableList<String> = File(filename).readLines().toMutableList()
    return words
}

fun pickRandomWord(words: MutableList<String>): String{
    val randomWord = words.random()
    words.remove(randomWord)
    return randomWord
}

fun obtainGuess(attempt: Int): String{
    println("Attempt $attempt")
    var word = readln().toString()
    if (isValid(word) == true){
        return word
    }
    else{
        println("Invalid word, please try again")
        obtainGuess(attempt+1)
    }
    return word
}

fun evaluateGuess(guess: String, target: String): List<Int>{
    var comparisonList = mutableListOf<Int>()
    for (n in 1..5){
        if (guess[n] == target[n]){
            comparisonList.add(1)
        }
        else{
            comparisonList.add(0)
        }
    }
    return comparisonList
}

fun displayGuess(guess: String, matches: List<Int>){
    for (n in 1..5){
        if (matches[n] == 1){
            print(guess[n])
        }
        else{
            print("?")
        }
    }    
    return
}