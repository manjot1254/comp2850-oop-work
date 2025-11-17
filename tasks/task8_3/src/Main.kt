// Task 8.3: weather station temperature analysis program

fun main() {
    // Add code here to:
    //   - Fetch data
    //   - Find records with lowest and and highest temperatures
    //   - Compute average temperature
    //   - Display all of these statistics
    val data = fetchData()
    val lowest = data.minBy{it.second}
    val highest = data.maxBy{it.second}
    val mean = averageTemp(data)

    println("$lowest\n")
    println("$highest\n")
    println("$mean\n")
}
