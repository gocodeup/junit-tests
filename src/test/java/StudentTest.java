import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student student1;
    Student student2;

    @Before
    public void setUp(){
        student1 = new Student(214567L, "Jack Smith");
        student1.addGrades(85);
        student1.addGrades(95);
        student1.addGrades(66);
        student2 = null;
    }

    @Test
    public void testIfStudentConstructorWorks(){
        assertNotNull(student1);
        assertNull(student2);
    }

    @Test
    public void testIfGetterWorks(){
        assertEquals(214567L, student1.getId());
        assertNotEquals(1L, student1.getId());
        assertEquals("Jack Smith", student1.getName());
        assertNotEquals("John Smith", student1.getName());
        assertEquals(95, (int) student1.getGrades().get(1));
        assertNotEquals(95, (int) student1.getGrades().get(0));
    }

    @Test
    public void testIfAddGradesWorks(){
        assertEquals(3, student1.getGrades().size());
    }

    @Test
    public void testIfGetGradeAverageWorks(){
        assertEquals(82.0, student1.getGradeAverage(), 0.1);
    }
}
