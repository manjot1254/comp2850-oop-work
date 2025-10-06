// Task 4.5: summing odd integers with a for loop
fun main(){
    val input = readln().toInt()
    var total = 0

    for (n in input downTo 1) {
        if (n%2 != 0){
            total = total + n
        }
    }

    println(total)
}