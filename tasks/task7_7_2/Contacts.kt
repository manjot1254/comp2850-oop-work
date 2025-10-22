// Task 7.7.2: contact database, using a map
fun main(){
    // 8.1:
    // {x: Double -> x*x}
    // {a: Int, b: Int -> a < b}

    var database = mutableMapOf<String,String>()
    var name = ""
    var number = ""

    while (name !in database || number !in database){
        println("What is the name?")
        name = readln()

        if (name in database){
            println("${name}'s phone number is ${database[name]}")
            return
        }
        else{
            println("What is the phone number?")
            number = readln()

            database[name] = number
        }
    }
}