// Implement the six required functions here
import java.io.File
import pickRandomWord

fun isValid(word: String): Boolean { 
    if (word.length == 5){
        return true
    }
    else{
        return false
    }
}

fun readWordList(filename: String): MutableList<String> { 
    var words: MutableList<String> = File(filename).readLines().toMutableList()
    return words
}

fun pickRandomWord(words: MutableList<String>): String { 
    val randomWord = words.random()
    words.remove(randomWord)
    return randomWord
}

fun obtainGuess(attempt: Int): String { 
    println("--Attempt $attempt--")
    var counter = 1
    var word = readln().toString().uppercase()

    val wordList = readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt");
    val targetWord = pickRandomWord(wordList);

    while (((isValid(word) == true) && (word.uppercase() != targetWord)) && (counter < 7)){
        println("No match.")
        displayGuess(word.uppercase(), evaluateGuess(word.uppercase(), targetWord))

        counter = counter + 1
        println("\n--Attempt $counter--")
        word = readln().toString()
    }
    if (counter > 6){
        println("Out of guesses")
        println("The word was $targetWord")

    }
    else if (isValid(word) != true){
        println("Invalid guess")
        println("The word was $targetWord")
    }   
    return word
}

fun evaluateGuess(guess: String, target: String): List<Int> { 
    var comparisonList = mutableListOf<Int>()
    for (n in 0..4){
        if (guess[n] == target[n]){
            comparisonList.add(2)
        }
        else if (guess[n] in target){
            comparisonList.add(1)
        }
        else{
            comparisonList.add(0)
        }
    }
    return comparisonList
}

fun displayGuess(guess: String, matches: List<Int>) { 
    for (n in 0..4){
        var char = guess[n]
        if (matches[n] == 2){
            print("\u001B[32m $char\u001B[0m")
        }
        else if (matches[n] == 1){
            print("\u001B[33m $char\u001B[0m")
        }
        else{
            print("\u001B[31m ?\u001B[0m")
        }}
    print("\n")
    return
}
