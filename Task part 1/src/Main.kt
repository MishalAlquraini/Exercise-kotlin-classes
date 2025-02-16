
class Book{
    var title: String = ""
    var author: String = ""
    var yearPublished: Int = 2000

//    fun info(): String{
//        return "Title: $title Author: "
//    }
}

fun main() {
    var myBook = Book()

    myBook.author = "Mishal"
    myBook.title = "Journey"
    myBook.yearPublished = 2025
}