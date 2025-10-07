// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun rollDie(sides: Int) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun main(){
    val sidesInput = readln().toString()
    val sidesIntput = readInt(sidesInput)
    rollDie(sidesIntput)
}

fun readInt(prompt: String): Int{
    val promptInt = prompt.toInt()
    return promptInt
}