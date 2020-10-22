import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {

    Student student1;
    Student student2;

    @Test
    public void testIfStudentConstructorWorks(){
        student1 = new Student(214567L, "Jack Smith");
        assertNotNull(student1);
        student2 = null;
        assertNull(student2);
    }

    @Test
    public void testIfGetterWorks(){
        student1 = new Student(214567L, "Jack Smith");
        assertEquals(214567L, student1.getId());
        assertNotEquals(1L, student1.getId());
        assertEquals("Jack Smith", student1.getName());
        assertNotEquals("John Smith", student1.getName());
        student1.addGrades(85);
        student1.addGrades(95);
        student1.addGrades(66);
        assertEquals(95, (int) student1.getGrades().get(1));
        assertNotEquals(95, (int) student1.getGrades().get(0));
    }

    @Test
    public void testIfAddGradesWorks(){
        student1 = new Student(214567L, "Jack Smith");
        assertEquals(0, student1.getGrades().size());
        student1.addGrades(85);
        assertEquals(1, student1.getGrades().size());
        student1.addGrades(96);
        assertEquals(2, student1.getGrades().size());
    }

    @Test
    public void testIfGetGradeAverageWorks(){
        student1 = new Student(214567L, "Jack Smith");
        student1.addGrades(85);
        student1.addGrades(95);
        student1.addGrades(66);
        assertEquals(82.0, student1.getGradeAverage(), 0.1);
    }
}
