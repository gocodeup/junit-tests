import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CohortTest {
    Student will = new Student(1, "William");
    Student fez = new Student(2, "Fez");
    Cohort Deimos = new Cohort();

    @Before
    public void setup(){
        Deimos.addStudent(will);
        Deimos.addStudent(fez);
        will.addGrade(100);
        will.addGrade(100);
        fez.addGrade(96);
        fez.addGrade(100);
    }

    @Test
    public void testAddAndGetStudent(){
        assertEquals(2,Deimos.getStudents().size());
    }


    @Test
    public void testAverage(){
        assertEquals(99, Deimos.getCohortAverage(),0);
    }
}
