// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    try{
        readData(args[0])
    }
    catch(error: NumberFormatException){
        println("Invalid argument supplied.")
    }
    catch(error: Exception){
        println("No argument supplied.")
    }

    val data = readData(args[0])
    println(variance(data))
}
