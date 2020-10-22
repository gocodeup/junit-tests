import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
//    public void testIfStudentClassHasCorrectProperties() {
//        Student test = new Student();
//        assertEquals(test.id, 0);
//        assertEquals(test.name, null);
//        assertEquals(test.grades, null);
//    }

    public void testIfConstructorWorksProperly() {
        Student test = new Student(01, "test");
    }
}
