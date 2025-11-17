// Task 8.3: functions for temperature analysis

fun List<Int>.toRecord(){
  //val other_list = listOf("One", "Two", "Three", "Four", "Five")
  //(other_list[this], this).to(Record)
  val
  
}

fun fetchData(): List<Record> {
  // Create and return a simulated dataset here
  // Use the listOf() and to() functions to create the dataset
  val list = listOf(1, 2, 3, 4, 5)
  for (i in 1..list.size){
    list[i-1].toRecord()
  }
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
