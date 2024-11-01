class Person(private val name: String) {
    infix fun say(string: String) = println("$name говорит: $string")
}