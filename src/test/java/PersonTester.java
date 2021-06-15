import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTester {

    @Test
    public void testPerson() {
        Person dave =  new Person("Dave");
        Person dave2 = new Person("Dave");

        assertEquals(dave, dave2);
        assertSame(dave, dave2);
    }
}
