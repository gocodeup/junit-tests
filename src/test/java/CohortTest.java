import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CohortTest {
    Student will = new Student(1L, "William");
    Student fez = new Student(2L, "Fez");
    Cohort Deimos = new Cohort();

    @Before
    public void setup(){
        Deimos.addStudent(will);
        Deimos.addStudent(fez);
        will.addGrade(95);
        will.addGrade(100);
        fez.addGrade(90);
        fez.addGrade(100);
    }

    @Test
    public void testAddStudent(){

    }

    @Test
    public void testGetStudentList(){

    }

    @Test
    public void testAverage(){

    }
}
