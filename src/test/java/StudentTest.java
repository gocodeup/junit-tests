import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student1;

    @Before
    public void setUp(){
        student1 = new Student(214567L, "Jack Smith");
    }

    @Test
    public void testIfStudentExists(){
        assertNotNull(student1);
    }

    @Test
    public void testIfIdWorks(){
        assertNotEquals(7890L, student1.getId());
        assertEquals(214567L, student1.getId());
    }

    @Test
    public void testIfNameWorks(){
        assertNotNull(student1.getName());
        assertEquals("Jack Smith", student1.getName());
        assertNotEquals("John Smith", student1.getName());
    }
}
