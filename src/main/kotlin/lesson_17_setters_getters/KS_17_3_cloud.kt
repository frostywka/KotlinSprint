package org.example.lesson_17_setters_getters

class Folder(val nameParam: String, val countFilesParam: Int, val isSecret: Boolean) {

    val name = nameParam
        get() = if (isSecret)
            "Скрытая папка, количество файлов в ней: 0"
        else
            "Название папки: $field, количество файлов: $countFilesParam"
}

fun main() {

    val folder = Folder("Games", 3, true)
    println(folder.name)

    val folder1 = Folder("PornHub", 1000, false)
    println(folder1.name)

    val folder2 = Folder("Files", 10, false)
    println(folder2.name)

}