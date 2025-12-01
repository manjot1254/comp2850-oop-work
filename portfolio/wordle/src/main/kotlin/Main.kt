fun main() {
    var attempt = 0
    val wordList = readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt");
    val targetWord = pickRandomWord(wordList);
    var word = ""
    
    while (word.uppercase() != targetWord){
        attempt = attempt + 1
        word = obtainGuess(attempt)
        displayGuess(word, evaluateGuess(word, targetWord))

        if (attempt == 6){
            println("Out of guesses")
            println("The word was $targetWord")
            return
        }
        else if (word.uppercase() == targetWord){
            println("Well done!\nThe word was $word!")
            return
        }
    }
}
