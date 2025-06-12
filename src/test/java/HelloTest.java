import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {
    @Test
    public void testGreet() {
        Hello hello = new Hello();
        assertEquals("Hello from Jenkins Agent!", hello.greet());
    }
}
