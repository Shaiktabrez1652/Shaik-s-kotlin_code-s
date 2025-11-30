fun main() {
    println("Hello, Kotlin!")

    val numbers = listOf(1, 2, 3, 4, 5)
    val squares = numbers.map { it * it }
    println("Squares: $squares")

    val greeting = greet("Codex")
    println(greeting)
}

fun greet(name: String): String = "Hi, $name!"
