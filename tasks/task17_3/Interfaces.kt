// Task 17.3: creating & using interfaces

// Add Printable interface here
class Printable: Document(), Printable{
    
}
// Add Document class here
class Document(documentName: String): Printable{
    fun info() = println("I am printable")
}
fun main() {
    val item: Printable = Document("info.txt")
    item.print()
}
