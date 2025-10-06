import kotlin.math.roundToInt

fun main(args: Array<String>){
    if (args.size == 3){
        var totalMark: Double = args[0].toDouble() + args[1].toDouble() + args[2].toDouble()
        totalMark = totalMark / 3
        val totalMarkrounded = totalMark.roundToInt()

        val grade = when (totalMarkrounded) {
            in 0..39   -> "Fail"
            in 40..69  -> "Pass"
            in 70..100 -> "Distinction"
            else       -> "?"
        }
        println(totalMarkrounded)
        println(grade)

    }
    else {
        println("Invalid number of marks.")
    }
}