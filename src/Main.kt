/** Задание 13: Количество сотрудников
 * Напишите функцию, принимающую на вход имена сотрудников и возвращающую их количество.
 * Используйте для этого vararg, из предыдущей темы.
 */
fun main(args: Array<String>) {
    val employeesList = mutableListOf<String>() // список для добавления новых сотрудников
    var isAddMore = false // флаг для зацикливания добавления новых сотрудников

    println("Давайте сформируем список сотрудников в офисе!")
    while (!isAddMore) {
        print("Введите имя сотрудника для добавления в общий список: ")
        employeesList.add(readLine()!!.trim())

        print("Добавить еще одного? [1-да, (другой символ)-нет]: ")
        isAddMore = readLine()!!.trim() != "1"
    }

    println("Количество сотрудников в офисе равно ${countEmployees(*employeesList.toTypedArray())}.")
}

/**
 * Функция подсчета сотрудников по количеству переданных элементов в параметрах.
 * Функция принимает vararg из строковых переменных и возвращает целое число по их количеству.
 */
fun countEmployees(vararg employees: String): Int {
    var counter = 0

    for (i in employees) {
        counter++
    }
    return counter
}