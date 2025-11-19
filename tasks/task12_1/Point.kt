import kotlin.math.hypot


class Point(var x: Double, var y: Double) {
    fun distance(): Double =
        hypot(x, y)
    fun distanceTo(p: Point): Double =
        hypot(x - p.x, y - p.y)
}

fun main(){
    val x = readln().toDouble()
    val y = readln().toDouble()
    val p = Point(x,y)

    println(p.distanceTo(Point(0.0,0.0)))
    println(p.distanceTo(Point(4.5,7.0)))
}