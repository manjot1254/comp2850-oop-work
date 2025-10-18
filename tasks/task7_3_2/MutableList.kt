// Task 7.3.1: list element access
fun main(){
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    println(numbers.get(0))
    //println(numbers[10])
    println(numbers.slice(2..4))    
    println(numbers.first())
    println(numbers.last())

    val numbers2 = listOf(2,3,4)

    numbers.add(1)
    println(numbers)
    numbers.addAll(numbers2)
    println(numbers)
    numbers.remove(4)
    println(numbers)
    numbers.removeAll(numbers2)
    println(numbers)
    numbers.removeAt(0)
    println(numbers)
    numbers.clear()
    println(numbers)

    //val empty = listOf("")
    //println(empty.first())
    //println(empty.last())
}