import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setUp(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student jill = new Student(1, "Jill Jack");
        jill.addGrade(80);

        Student bob = new Student(2, "Bob Smith");
        bob.addGrade(100);
        bob.addGrade(100);
        bob.addGrade(100);

        cohortWithOne.addStudent(jill);
        cohortWithMany.addStudent(jill);
        cohortWithMany.addStudent(bob);

    }

    @Test
    public void testAddStudent(){
        cohortWithMany.addStudent(new Student(3, "John Doe"));

        assertEquals("John Doe", cohortWithMany.getStudents().get(2).getName());

    }

    @Test
    public void testCurrentList(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());

        assertEquals(1, cohortWithMany.getStudents().get(0).getId());
        assertEquals(2, cohortWithMany.getStudents().get(1).getId());
    }

    @Test
    public void testGetAverage(){
        assertEquals(Double.NaN, emptyCohort.getCohortAverage(), 0);
        assertEquals(80, cohortWithOne.getCohortAverage(), 0);
        assertEquals(90, cohortWithMany.getCohortAverage(),0);
    }

}
