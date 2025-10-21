// Task 7.7.1: stats for a numeric dataset
fun median(floatList: MutableList<Int>): <Int>{
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
    for (y in 0 until floatList.size){
        var current: Int = floatList[y]
        if (medianList[y]!! > highest){
            highest = medianList[y]!!
        }
    }
    return highest
}

fun main(){
    readData()
}

fun readData() {
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

    println(median(floatList))
    }
}
