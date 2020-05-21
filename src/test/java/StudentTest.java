import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class StudentTest {

    List<Integer> grades;


    @Before
    public void setUpGradesList () {
    grades = new ArrayList<>();
    grades.add(80);
    grades.add(90);
    }

    @Test
    public void testIfListIsInitialized () {
        assertNotNull(grades);
    }

    @Test
    public void testIf80IsInList () {
//    assertEquals(80, grades.get(0));
    assertTrue(grades.contains(80));
    assertTrue(grades.contains(90));
    }

@Test
    public void testGradeAverage () {
        Student student = new Student("Ramon", 8908098L);
        student.addGrade(80);
        student.addGrade(90);
    assertEquals(85, student.getGradeAverage(), 0.5);
//    assertNotEquals(90, Student.getGradeAverage(), 0.5);
}

@Test
    public void testId () {
        Student sam = new Student("sam", 8938493L);
    assertEquals(8938493L, sam.getId());
}

@Test
    public void testGetName () {
        Student nancy = new Student("nancy", 4534534L);
        assertEquals("nancy", nancy.getName());
}

}
