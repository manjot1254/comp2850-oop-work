// Task 7.7.1: stats for a numeric dataset
fun readData() {
    // Print a prompt for the user
    println("Enter a series of floating-point numbers")
    val floatList = readln().toInt()
    var outputList = [""]
    
    // Write a loop to read the numbers
    for (item in floatList){
        // Inside this loop, call add() to add a number to list
        outputList.add(floatList[item])
    }
}