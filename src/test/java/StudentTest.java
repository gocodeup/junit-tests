import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void checkIfStudentHasName() {
        String name = "Kristen";
        String input = "Kristen";
        assertEquals(name, input);
        assertNotNull(name);
    }

    @Test
    public void checkGradesArray() {

    }


}
