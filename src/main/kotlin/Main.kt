import java.util.*


fun main() {
    val calendar = Calendar.getInstance()
    val timestamp = calendar.timeInMillis
    val post = Post(
        id = 1,
        ownerId = 15,
        fromId = 25,
        createdBy = 1,
        date = timestamp,
        text = "Новый пост 1",
        replyPostId = 10,
        comments = "",
        copyright = "",
        likes = 0,
        views = 0,
        postType = "",
        signerId = 0,
    )
    print(post)
    WallService.add(post)
}