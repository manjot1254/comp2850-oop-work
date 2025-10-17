// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    // Write your unit tests here!
    "Different lengths"{
        { val hi = "hi"; hi.anagramOf("hello") shouldBe false }
    }
    "Empty string"{
        { val empty = ""; empty.anagramOf(empty) shouldBe false}
    }
    "Non-empty string"{
        { val okay = "okay"; okay.anagramOf(okay) shouldBe "okay == okay" }
    }
    "Anagram"{
        { val yako = "yako"; yako.anagramOf("okay") shouldBe "yako == okay" }
    }
    "Case-anagram"{
        { val YaKo = "YaKo"; YaKo.anagramOf("OKAY") shouldBe "YaKo == OKAY" }
    }
})
