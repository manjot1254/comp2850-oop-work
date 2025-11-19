// Task 10.3.2: another example of an explicit null check
fun main() {
    print("Enter a string: ")
    val input = readLine()
    println("Input: $input")
    val result = input?.reversed()?.uppercase() ?: "???"
    println("Result: $result")
}
