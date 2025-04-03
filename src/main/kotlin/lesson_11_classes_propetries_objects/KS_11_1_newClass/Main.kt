package lesson_11_classes_propetries_objects.KS_11_1_newClass

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