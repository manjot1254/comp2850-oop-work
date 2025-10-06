fun main(args: Array<String>){
    println("PIZZA MENU\n\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian")
    val input = args[0].toString().lowercase()
    if (input.length == 1 && input in CharRange('a','d')){
        println("Order accepted.")
    }
    else{
        println("Invalid choice!")
    }
}