import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class StudentTest {
    private Student student1;

    @Before
    public void setUp(){
        student1 = new Student(1234567890, "Student1");
        student1.addGrade(91);
        student1.addGrade(90);
        student1.addGrade(89);
    }

    @Test
    public void testName(){
        assertEquals("Student1", student1.getName());
        assertNotEquals("Student", student1.getName());

    }

    @Test
    public void testID(){
        assertEquals(1234567890, student1.getId());
        assertNotEquals(1234567891, student1.getId());
    }

    @Test
    public void testGrades(){
        ArrayList<Integer> testGrade = new ArrayList<>();
        testGrade.add(91);
        testGrade.add(90);
        testGrade.add(89);
        assertEquals(testGrade, student1.getGrades());
    }

    @Test
    public void testGradeAverage(){
        assertEquals(90, student1.getGradeAverage(),0);
    }

}
