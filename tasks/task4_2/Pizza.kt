fun main(){
    println("PIZZA MENU\n\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian")
    
    val input = readln().lowercase()
    val x = if (input.length == 1 && input in ("a".."d")){
        println("Order accepted.")
    }
    else{
        println("Invalid choice!")
    }
}