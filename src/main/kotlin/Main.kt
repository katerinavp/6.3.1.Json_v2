package gson

import com.google.gson.Gson
import java.io.File

fun main() {
        val list = listOf(
        Post(PostType.SIMPLE, 1, "2020-12-09 19:20:03", "Petrov", "Post1", null, null, null, null, null),
        Post(PostType.SIMPLE, 2, "2020-09-09 10:20:03", "Ivanov", "Post2", null, null, null, null, null),
        Post(
            PostType.EVENT,
            3,
            "2020-09-09 10:20:03",
            "Ivanov",
            "Post3",
            "Москва, ул. Ленинская Слобода",
            Pair(56.13003526647825, 40.41206278961915),
            null,
            null,
            null
        ),
        Post(PostType.REPOST, 4, "2020-12-09 19:20:03", "Petrov", null, null, null, "RepostText", null, null),
        Post(
            PostType.VIDEO,
            5,
            "2020-12-09 19:20:03",
            "Petrov",
            "Post5",
            null,
            null,
            null,
            "https://www.youtube.com/watch?v=WhWc3b3KhnY",
            null
        ),
        Post(
            PostType.ADV,
            6,
            "2020-12-09 19:20:03",
            "Petrov",
            "Post6",
            null,
            null,
            null,
            null,
            "https://netology.ru/"
        ),
    )
    val turns = Gson().toJson(list)

    println("сериализация + $turns")
    val fileName = "./posts.json"

    var file = Vfs.File(fileName)
    file.writeText(turns)

}


















