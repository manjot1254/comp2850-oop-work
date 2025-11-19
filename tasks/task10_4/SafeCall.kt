// Task 10.3.2: another example of an explicit null check
fun main() {
    print("Enter a string: ")
    val input = readLine()
    println("Input: $input")
    println("Result: " + input?.reversed()?.uppercase())
}
