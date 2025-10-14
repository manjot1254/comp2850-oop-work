// Task 5.3.2: dice rolling simulation
import kotlin.random.Random

fun rollDie(sides: Int) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a $sides-sided die...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}

fun rollDice(sides: Int=6, numRoles: Int=1){
    for (n in numRoles downTo 1){
        rollDie(sides)
    }   
}

fun main(){
    println("Specify own die side and roll quantity values?")
    val result = readln().toString()
    if (result.lowercase() == "yes" || result.lowercase() == "y"){
            println("How many sides?")
            val sidesInput = readln().toInt()

            println("How many times?")
            val numRolesinput = readln().toInt()

            rollDice(sidesInput, numRolesinput)
    }
    else{
        rollDice()
    }

}

fun readInt(prompt: String): Int{
    val promptInt = prompt.toInt()
    return promptInt
}