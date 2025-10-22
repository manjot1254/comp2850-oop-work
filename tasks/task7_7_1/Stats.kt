// Task 7.7.1: stats for a numeric dataset
fun median(floatList: MutableList<Int>): Int{
    var medianList = mutableMapOf<Int, Int>()

    for (x in 0 until floatList.size){
        var current: Int = floatList[x]
        if (medianList[current] == null){
            medianList[current] = 1
        }
        else {
            medianList[current] = medianList[current]!! + 1
        }
    }
    var highest = 0 
    println(floatList)
    println(medianList)
    medianList.forEach{ entry ->
        if (entry.value > highest){
            highest = entry.key
        }}
    return highest
}

fun main(){
    val floatList = readData()

    println("Minimum Value: ${floatList.min()}")
    println("Maximum Value: ${floatList.max()}")
    println("Mean Value: ${floatList.average()}")
    println("Median: ${median(floatList)}")
}

fun readData(): MutableList<Int> {
    // Print a prompt for the user
    println("Enter a series of floating-point numbers, type -1 when done.")
    var floatList = mutableListOf<Int>()
    
    var userInput = 0
    while (userInput != -1){
        userInput = readln().toInt()
        floatList.add(userInput)
    }
    

    floatList.remove(-1)
    // Write a loop to read the numbers
    for (i in 0 until floatList.size){
        // Inside this loop, call add() to add a number to list
        println(floatList[i])
    }
    return floatList
}
