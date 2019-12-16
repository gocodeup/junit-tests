import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void createStudentTest() {
        Student fer = new Student("fer", 1);
        Student foo = null;
        assertNotNull(fer);
        assertNull(foo);
    }

    @Test
    public void checkStudentProperties() {
        Student fer = new Student("fer", 1);
        fer.addGrades(75);
        assertEquals("fer",fer.getName());
        assertEquals(1,fer.getId());
        assertEquals(1, fer.getGrade().size());
    }

    @Test
    public void checkGradeAverage(){
        Student fer = new Student("fer", 1);
        fer.addGrades(80);
        fer.addGrades(90);
        fer.addGrades(100);
        assertEquals(90, fer.getAverage(), 0.5);
    }


}
