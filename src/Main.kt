/** Задание 15: Лямбда
 * Создайте переменную, которая содержит лямбда выражение для вывода в консоль данных массива типа String.
 */
fun main(args: Array<String>) {

    // Реализация лямбда-выражения печати массива в виде пронумерованного списка
    val printStringArrayNumbered = { array: Array<String> ->
        println("Печать строкового массива в виде пронумерованного списка: ")
        var counter = 1
        for (i in array) {
            println("$counter. $i")
            counter++
        }
        println()
    }

    // Реализация лямбда-выражения печати массива в виде последовательности в скобках
    val printStringArrayBrackets = { array: Array<String> ->
        println("Печать строкового массива в виде последовательности в скобках: ")

        print("[")
        for (i in array.indices) {
            if (i != array.lastIndex) {
                print("${array[i]}, ")
            } else {
                print(array[i])
            }
        }
        println("]")
    }

    val stringArray = arrayOf("Eat", "Code", "Sleep", "Repeat")
    printStringArrayNumbered(stringArray)
    printStringArrayBrackets(arrayOf("One", "Two", "Three", "Four", "Five"))
}