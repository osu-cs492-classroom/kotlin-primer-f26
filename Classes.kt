import java.io.File

class Student(val id: Int, val name: String, var gpa: Double)

class Rectangle(var width: Int, var height: Int) {
    val area get() = this.width * this.height

    fun print() {
        println("This is a ${width} x ${height} rectangle.")
    }
}

class FileReader(val filename: String) {
    val fileContents: String
    init {
        val file = File(filename)
        fileContents = file.readText()
    }
    // val anotherProp: Int
    // init {

    // }
}

fun main() {
    val s = Student(933111111, "Leia Organa", 3.9)
    s.gpa = 3.95
    println("GPA for ${s.name}: ${s.gpa}")

    val r = Rectangle(4, 8)
    println("area of r: ${r.area}")
    r.print()
    r.width = 16
    println("area of r (after update): ${r.area}")
    r.print()

    val f = FileReader("Classes.kt")
    println("${f.fileContents}")
}
