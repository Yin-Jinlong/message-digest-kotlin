import io.github.yinjinlong.md.md5
import io.github.yinjinlong.md.md5Hex
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * @author YJL
 */
class Test {

    @Test
    fun test() {
        assertEquals("5eb63bbbe01eeed093cb22bb8f5acdc3", "hello world".md5Hex)
    }

}