import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortsTest {
    @Before
    public void newStudentCreation() {
    }


    @Test
    public void addStudentTest() {
        Cohort newCohort = new Cohort();
        Student james = new Student("james",2);
        newCohort.addStudent(james);
        assertEquals(1,newCohort.getStudents().size());
    }

    @Test public void getStudentsListTest(){
        Cohort newCohort = new Cohort();
        Student james = new Student("james",2);
        newCohort.addStudent(james);
        System.out.println();
    }

}
