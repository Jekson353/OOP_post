import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addTest() {
        val post = Post(
            id = 1,
            ownerId = 15,
            fromId = 25,
            createdBy = 1,
            date = 0,
            text = "Новый пост 1",
            replyPostId = 10,
            comments = "",
            copyright = "",
            likes = 0,
            views = 0,
            postType = "",
            signerId = 0,
        )
        val result = WallService.add(post)
        assertEquals(result, post)
    }
}