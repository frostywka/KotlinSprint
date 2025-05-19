package org.example.lesson_17_setters_getters

class Folder(val nameParam: String, val countFilesParam: Int, val flagParam: String) {

    val name = nameParam
        get() = when {
            flagParam == "секретно" -> "Скрытая папка, количество файлов в ней: 0"
            flagParam != "секретно" -> "Название папки: $field, количество файлов: $countFilesParam"
            else -> field
        }
}

fun main() {

    val folder = Folder("Games", 3, "секретно")
    println(folder.name)

    val folder1 = Folder("PornHub", 1000, "опен")
    println(folder1.name)

    val folder2 = Folder("Files", 10, "хурма")
    println(folder2.name)

}