fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}

fun isEnglishVowel(c: Char) = c.lowercase() in "aeiou"

fun main{
    val a_string = "this is a string"
    a_string.howMany('a')
}