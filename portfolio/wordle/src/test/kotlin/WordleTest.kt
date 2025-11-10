import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    // Write your tests here

    // Function 1: isValid()
    isValid("hello") shouldBe true
    isValid("hell") shouldBe false
    
    // Function 2: readWordList()
    (readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt").first()) shouldBe "ABACK"
    (readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt").last()) shouldBe "ZONAL"

    // Function 3: pickRandomWord()
    ((pickRandomWord(readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt"))) in readWordList("/workspaces/comp2850-oop-work/portfolio/wordle/data/words.txt")) shouldBe true
    
    // Function 4: obtainGuess()
    obtainGuess(1)
})
