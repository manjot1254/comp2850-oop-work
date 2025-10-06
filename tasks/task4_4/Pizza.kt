fun main(){
    var input = ""
    do {
        println("\nPIZZA MENU\n\n(a) Margherita\n(b) Quattro Stagioni\n(c) Seafood\n(d) Hawaiian\n")
        var input = readln().lowercase()
    }
   while (((input.length == 1) && (input in "a".."d")) == false)
}