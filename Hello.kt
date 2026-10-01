fun main() {
  // println("Hello, world!")

  // var a: Int = 64
  // var b = 32

  // // b = 4.25

  // var x: Double
  // x = b.toDouble()
  // // b = x.toInt()

  // val n = 128
  // // n = 32

  // var nonNull = "This is a string"
  // // nonNull = null

  // var nullable: String? = "This string is nullable"
  // nullable = null

  // println(nonNull.length)
  // println(nullable?.length ?: 0)
  // println("The length of nullable is ${nullable?.length ?: 0}")

  // if (nullable?.length ?: 0 > 16) {
  //   println("nullable is pretty long")
  // } else {
  //   println("nullable is short")
  // }

  // val m = if (a > b) {
  //   println("a is bigger")
  //   a
  // } else {
  //   println("b is bigger")
  //   b
  // }
  // println("m: ${m}")
  // val m2 = if (a > b) a else b

  // val lenStr = when (nullable?.length ?: 0) {
  //   0 -> "string is empty"
  //   in 1..16 -> "string is pretty short"
  //   else -> "string is pretty long"
  // }
  // println("lenStr: ${lenStr}")

  // val donuts = listOf("glazed", "sugar", "buttermilk")
  // println("donuts: ${donuts}")

  // var mutableDonuts = mutableListOf("glazed", "sugar", "buttermilk")
  // mutableDonuts.add("cream filled")
  // println("mutableDonuts: ${mutableDonuts}")
  // println("mutableDonuts.size: ${mutableDonuts.size}")

  // printGreeting("CS 492")
  // printGreeting("world", greeting = "Howdy")
  // println("2^6 = ${powerOf(2, 6)}")
  // println("2*6 = ${timesTwo(6)}")

  val pets = listOf("cat", "dog", "fish", "cow", "canary")
  val filteredPets = pets.filter(::startsWithC)
  println("filteredPets: ${filteredPets}")

  val filteredPets2 = pets.filter(
    { pet -> pet.startsWith('c') }
  )
  println("filteredPets2: ${filteredPets2}")

  // val squares = List<Int>(10, { i -> i * i })
  // val squares = List<Int>(10, { it * it })
  val squares = List<Int>(10) { it * it }
  println("squares: ${squares}")
}

fun startsWithC(str: String) = str.startsWith('c')

fun printGreeting(
  who: String,
  a: Int = 0,
  b: Int = 0,
  c: Int = 0,
  d: Int = 0,
  e: Int = 0,
  f: Int = 0,
  g: Int = 0,
  greeting: String = "Hello"
): Unit {
  println("${greeting}, ${who}!")
}

fun powerOf(base: Int, exponent: Int): Int {
  var result = 1
  for (i in exponent downTo 1) {
    result *= base
  }
  return result
}

fun timesTwo(x: Int) = x * 2
