data class Todo(val title: String, val done: Boolean = false)

fun List<Todo>.pending() = filterNot { it.done }

fun main() {
    val todos = listOf(
        Todo("Write Kotlin snippet"),
        Todo("Review PRs", done = true),
        Todo("Drink coffee")
    )

    println("All: $todos")
    println("Pending: ${todos.pending()}")
}
