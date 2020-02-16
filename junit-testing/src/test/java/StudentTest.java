import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {

Student student;

    @Before
    public void setUp(){
        ArrayList<Integer> studentGrades = new ArrayList<>();
        student = new Student(5, "Joe", studentGrades);
        studentGrades.add(5);
    }

    @Test
    public void testIfGetIdEquals() {
        assertEquals(5, student.getId());
    }

    @Test
    public void testIfAddGradeIsCorrect() {
        student.addGrade(5);
        assertTrue(student.grades.size() == 2);
    }

    @Test
    public void testIfGetNameEquals() {
        assertEquals("Joe", student.getName());
    }

//    @Test
//    public void testIfAverageIsCorrect() {
//        student.getGradeAverage();
//        assertTrue(student.getGradeAverage() == );
//    }

}
