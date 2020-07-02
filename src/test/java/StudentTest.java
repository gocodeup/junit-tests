import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    private Student student;
    private Student blankStudent;

    @Before
    public void setUp() {
        //test for student id
        student = new Student(1, "Ramon");
        student.addGrade(100);
        student.addGrade(80);
        student.addGrade(70);
        student.addGrade(60);
        student.addGrade(85);

        //
        blankStudent = new Student();
        blankStudent.setName("Laura");
        blankStudent.setId(2);
        blankStudent.addGrade(100);
    }

    @Test
    public void testIdIsLong() {
        assertEquals(1, student.getId());
    }

    @Test
    public void testNameisName() {
        assertEquals("Ramon", student.getName());
    }

    @Test
    public void testAddGrade() {
        assertEquals(5, student.getGrades().size());
    }
    @Test
    public void getGradeAverage() {

    }
}
