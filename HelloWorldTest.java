import static org.junit.Assert.*;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testMessage() {
        assertEquals("Hello, Jenkins!", "Hello, Jenkins!");
    }
}
