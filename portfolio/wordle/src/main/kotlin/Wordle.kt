// Implement the six required functions here
fun isValid(word: String): Boolean{
    if (word.length == 5){
        return true
    }
    else{
        return false
    }
}

fun readWordList(filename: String): MutableList<String>{
    var wordList = mutableListOf<String>()
    var forLoop = (filename).forEachLine { mutableListOf.add() }
    return wordList
}

fun pickRandomWord(words: MutableList<String>): String{
    words.remove(Random.words)
    return words
}

fun obtainGuess(attempt: Int): String{
    println("Attempt $attempt")
    var word = readln().toString()
    if isValid(word) == true{
        return word
    }
    else{
        println("Invalid word, please try again")
        attempt =+ 1
        obtainGuess(attempt)
    }
    return
}

fun evaluateGuess(guess: String, target: String): List<Int>{
    var comparisonList = mutableListOf<Int>()
    for i in guess{
        if guess[i] == target[i]{
            comparisonList.add[1]
        }
        else{
            comparisonList.add[0]
        }
    }
    return comparisonList
}

fun displayGuess(guess: String, matches: List<Int>){
    for i in guess{
        if matches[i] == 1{
            print(guess[i])
        }
        else{
            print("?")
        }
    }    
    return
}