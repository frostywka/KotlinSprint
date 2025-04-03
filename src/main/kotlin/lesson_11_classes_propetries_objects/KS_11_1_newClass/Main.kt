package lesson_11_classes_propetries_objects.KS_11_1_newClass

/*
Создай класс, который будет хранить данные пользователя.
 В свойствах должна храниться информация об уникальном идентификаторе, логине, пароле и почте.
  Названием может быть, например, User.
  Создай два экземпляра класса с произвольными данными и выведи в консоль содержимое их полей.
 */

fun main() {

    val user1 = User(
        id = 123,
        login = "agent",
        password = "007",
        mail = "mail@mail.ru",
        )

    val user2 = User(
        id = 777,
        login = "Jonhy",
        password = "Silverhand",
        mail = "cyberpunk@ea.com",
    )

    println(user1)
    println(user2)

}