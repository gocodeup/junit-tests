import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void checkIfStudentHasName() {
        Student student = new Student(1234567, "Harold");
        Student student2 = null;
        assertNotNull(student);
        assertNull(student2);
    }

    @Test
    public void checkGradesArray() {
        Student student = new Student(1234567, "Jonathan");
        student.addGrade(100);
        assertEquals(1, student.getGrades().size());
    }

    @Test
    public void checkIfStudentHasId() {
        Student student = new Student(1234567, "Julie");
        assertSame(1234567, student.getId());
    }

    @Test
    public void checkAverageMethod() {
        Student student = new Student(12345678, "Lucas");
        student.addGrade(50);
        student.addGrade(100);
        assertEquals(75, student.getGPA(), 0);


    }


}
