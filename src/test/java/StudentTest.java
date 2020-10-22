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
    }
}
