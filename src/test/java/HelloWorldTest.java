import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testIfHelloWorldWorks() {
        String expected = "Hello World!";
        assertEquals(expected, HelloWorld.hello());
    }
}
