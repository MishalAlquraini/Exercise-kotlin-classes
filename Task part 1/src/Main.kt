
// title after book = its a requirement (constructor
// it can be after Book or write constructor
class Book(var title: String, var author: String, var yearPublished: Int){
//    var title: String = ""
//    var author: String = ""
//    var yearPublished: Int = 2000
//    constructor(title: String, author: String, yearPublished: Int)
//    fun info(){
//        println("title= $title, author: $author, Published: $yearPublished")
//    }
fun getBookInfo(){
    println("$title by $author ($yearPublished)")
}
}
// name = primary constructor , accNum is a secondary constructor
class bankAcc(var name: String) {
    constructor( accountNum: Int): this("")
    fun printInfo(){
        println("Account Holder: $name")
    }
}


fun main() {
   var nbkAcc = bankAcc("Mishal")
    nbkAcc.printInfo()

    var myBook = Book("Journey", "Mishal", 20205)
//    myBook.author = "Mishal"
//    myBook.title = "Journey"
//    myBook.yearPublished = 2025
//    myBook.info()
    myBook.getBookInfo()
}