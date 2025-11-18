// Task 8.3: functions for temperature analysis
typealias Record = Pair<String, Double>

fun fetchData(): List<Record> {
  // Create and return a simulated dataset here
  // Use the listOf() and to() functions to create the dataset
  val list = listOf("London" to 25.0, "Stockholm" to 30.0, "Paris" to 55.0, "Berlin" to 40.0)
  return list
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
