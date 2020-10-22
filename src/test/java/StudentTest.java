import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student1;

    @Before
    public void setUp(){
        student1 = new Student();
    }

    @Test
    public void testIfStudentExists(){
        assertNotNull(student1);
    }

}
