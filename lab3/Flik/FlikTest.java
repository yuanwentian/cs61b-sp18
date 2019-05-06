import org.junit.Test;
import static org.junit.Assert.*;

public class FlikTest {
    @Test
    public void testIsSameNumber() {
        assertTrue("a = 127, b = 127, a != b", Flik.isSameNumber(127, 127));
        assertTrue("a = 128, b = 128, a != b", Flik.isSameNumber(128, 128));
        assertTrue("a = null, b = null, a != b", Flik.isSameNumber(null, null));
        assertFalse("a = 1, b = 0, a = b", Flik.isSameNumber(1, 0));
        assertFalse("a = 1, b = null, a = b", Flik.isSameNumber(1, null));
    }
}
