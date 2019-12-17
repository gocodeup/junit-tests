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
        assertEquals(1, fer.getGrades().size());
    }

    @Test
    public void checkGradeAverage(){
        Student fer = new Student("fer", 1);
        fer.addGrades(80);
        fer.addGrades(90);
        fer.addGrades(100);
        assertEquals(90, fer.getAverage(), 0.5);
    }

    @Test
    public void updatedGradeTest(){
        Student fer = new Student("fer", 1);
        fer.addGrades(80);
        fer.updateGrade(90, 0);
        assertEquals(90, (int) fer.getGrades().get(0));
    }

    @Test
    public void removedGradeTest(){
        Student fer = new Student("fer", 1);
        fer.addGrades(90);
        fer.addGrades(100);
        fer.removeGrade(1);
        assertEquals(1,fer.getGrades().size());
    }


}
