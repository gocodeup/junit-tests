import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    Student fer;
    Student ryan;
    @Before
    public void setUp(){
        fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
    }


    @Test
    public void testCreateStudent(){
        assertNull(ryan);
        assertNotNull(fer);
    }

    @Test
    public void testStudentFields(){
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(2, fer.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        assertSame(100, fer.getGrades().get(0));
        assertSame(80, fer.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        assertEquals(90, fer.getGradeAverage(), 0);
    }
}