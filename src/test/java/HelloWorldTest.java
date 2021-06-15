import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class HelloWorldTest {
    private String expected;

    @Before
    public void setUp(){
        this.expected = "Hello World";
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfHelloWorldWorks(){
        String expected = "Hello, World!";

        assertEquals(expected, HelloWorld.hello("Lex"));
        assertNotNull(HelloWorld.hello("Lex"));
        assertNotEquals("Hello, null!", HelloWorld.hello("Lex"));
        assertNotEquals("Hello, null!", HelloWorld.hello(null));
        assertEquals(expected, HelloWorld.hello("Lex"));
    }
}
