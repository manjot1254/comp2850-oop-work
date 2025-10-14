fun String.tooLong() = this.length > 20
fun main(){
    val stringInput = readln().toString()
    println(stringInput.tooLong())
}