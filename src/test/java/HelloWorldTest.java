import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testIfHelloWorldWorks(){
        String expected = "Hello, World!";
        String expectedDustin = "Hello Dustin"
;

        assertEquals(expected, HelloWorld.hello());
        assertEquals(expectedDustin, HelloWorld.hello("Dustin"));
    }

}
