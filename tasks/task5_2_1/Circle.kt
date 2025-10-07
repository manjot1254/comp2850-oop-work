// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius
fun circlePerimeter(radius: Double) = 2 * PI * radius

fun readDouble(prompt: String): Double{
    println(prompt)
    val doubleInput = readln().toDouble()
    return doubleInput
}

fun main(){
    val radius = readDouble("What is the radius?")
    
    System.out.printf("Circumference = %.4f\n", circleArea(radius))
    System.out.printf("Perimeter = %.4f\n", circlePerimeter(radius))
}