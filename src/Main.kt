fun main() {
    //Задача 1
    println(
        "Ответ к задаче 1: \n" +
                "3 + 2 = ${3 addition 2}\n" +
                "5 - 4 = ${5 subtraction 4}\n" +
                "6 / 2 = ${6 division 2}\n" +
                "7 * 8 = ${7 multiplication 8}"
    )

    //Задача 2
    val person = Person("Человек")
    println("Ответ к задаче 2:")
    person say "Привет"

    //Задача 3
    val a = Point(1, 2)
    val b = Point(2, 4)
    println("Ответ к задаче 3:")
    a isAbove b
    a isRightOf b
}

//Функции для задачи 1
infix fun Int.addition(number: Int) = this + number

infix fun Int.subtraction(number: Int) = this - number

infix fun Int.division(number: Int) = this / number

infix fun Int.multiplication(number: Int) = this * number

//Функции для задачи 3
infix fun Point.isAbove(point: Point) {
    println(
        if (this.y > point.y) "Первая точка находится выше второй"
        else "Первая точка находится ниже второй"
    )
}

infix fun Point.isRightOf(point: Point) {
    println(
        if (this.x > point.x) "Первая точка находится правее второй"
        else "Первая точка находится левее второй"
    )
}
