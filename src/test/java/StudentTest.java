import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class StudentTest {
    private List<Student> tests;
//    @Test
//    public void testIfStudentClassHasCorrectProperties() {
//        Student test = new Student();
//        assertEquals(test.id, 0);
//        assertEquals(test.name, null);
//        assertEquals(test.grades, null);
//    }

    @Before
    public void setUp() {
        this.tests = new ArrayList<>();
        Student test01 = new Student(01, "test01");
        this.tests.add(test01);
;    }

    @Test
    public void testIfConstructorWorksProperly() {
        Student test = new Student(01, "test");
    }

    @Test
    public void testGetters() {
        assertNotEquals(tests.get(0).getId(), 0);
        assertNotEquals(tests.get(0).getName(), null);
        assertEquals(tests.get(0).getId(), 01);
        assertEquals(tests.get(0).getName(), "test01");
    }
}
