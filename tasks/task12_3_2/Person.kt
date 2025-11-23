// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
}

fun main(){
    val date = LocalDate.of(2006, 4, 1)
    val human = Person("Manjot", date)
    println("You are ${human.name}, born on ${human.birth}")
}