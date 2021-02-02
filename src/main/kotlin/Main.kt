package gson

import com.google.gson.Gson
import java.io.File

fun main() {
    val list = listOf(
            Post(PostType.ADV, 9, "2020-12-09 19:20:03", "Petrov", "ADVPost1", null, null, null, null, "https://netology.ru/"),
            Post(PostType.ADV, 10, "2020-12-09 19:20:03", "Petrov", "ADVPost2", null, null, null, null, "https://netology.ru/"),
            Post(PostType.ADV, 11, "2020-12-09 19:20:03", "Petrov", "ADVPost3", null, null, null, null, "https://netology.ru/"),
            Post(PostType.ADV, 12, "2020-12-09 19:20:03", "Petrov", "ADVPost4", null, null, null, null, "https://netology.ru/"),
//            Post(PostType.SIMPLE, 1, "2020-12-09 19:20:03", "Petrov", "Post1", null, null, null, null, null),
//            Post(PostType.SIMPLE, 2, "2020-09-09 10:20:03", "Ivanov", "Post2", null, null, null, null, null),
//            Post(
//                    PostType.EVENT,
//                    3,
//                    "2020-09-09 10:20:03",
//                    "Ivanov",
//                    "Post3",
//                    "Москва, ул. Ленинская Слобода",
//                    Pair(56.13003526647825, 40.41206278961915),
//                    null,
//                    null,
//                    null
//            ),
//            Post(PostType.REPOST, 4, "2020-12-09 19:20:03", "Petrov", null, null, null, "RepostText", null, null),
//            Post(
//                    PostType.VIDEO,
//                    5,
//                    "2020-12-09 19:20:03",
//                    "Petrov",
//                    "Post5",
//                    null,
//                    null,
//                    null,
//                    "https://www.youtube.com/watch?v=WhWc3b3KhnY",
//                    null
//            ),
//            Post(PostType.SIMPLE, 6, "2021-01-01 19:20:03", "Popov", "Post6", null, null, null, null, null),
//            Post(PostType.SIMPLE, 7, "2021-01-10 19:20:03", "Popov", "Post7", null, null, null, null, null),
//            Post(PostType.SIMPLE, 8, "2021-01-09 19:20:03", "Popov", "Post8", null, null, null, null, null),

            )
    val turns = Gson().toJson(list)

    println("сериализация + $turns")
    val fileName = "./postsAdv.json"

    var file = File(fileName)
    file.writeText(turns)

}


















