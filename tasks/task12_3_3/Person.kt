// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }
}

fun main(){
    println("Enter name: ")
    val name = readln()

    println("Enter year of birth: ")
    val year = readln().toInt()
    println("Enter month of birth: ")
    val month = readln().toInt()
    println("Enter day of birth: ")
    val day = readln().toInt()

    var date = LocalDate.of(year, month, day)
    
    val human = Person(name, date)
    println("You are ${human.name}, born on ${human.birth}")
}