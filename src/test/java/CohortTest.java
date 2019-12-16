import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort eternal;
    Student first;
    Student second;
    Student third;
    Student fourth;

    @Before
    public void setUp(){
        first = new Student(3333333, "Sarasa");
        second = new Student(2222222, "Tweyen");
        third = new Student(9999999, "Niyon");
        fourth = new Student(5555555, "Fif");

        eternal = new Cohort();
        eternal.addStudent(first);
        eternal.addStudent(second);
        eternal.addStudent(third);
        eternal.addStudent(fourth);
    }

    @Test
    public void testIfAddStudentWorks(){
        assertEquals(4, eternal.getStudents().size());
    }

    @Test
    public void testIfGetStudentsWorks(){
        assertEquals(first, eternal.getStudents().get(0));
        assertEquals(fourth, eternal.getStudents().get(3));
    }

    @Test
    public void testIfGetAveragesWorks(){
        first.addGrade(60);
        first.addGrade(55);
        first.addGrade(0);
        second.addGrade(86);
        second.addGrade(92);
        second.addGrade(94);
        third.addGrade(95);
        third.addGrade(96);
        third.addGrade(100);
        fourth.addGrade(90);
        fourth.addGrade(80);
        fourth.addGrade(87);
        assertEquals(78, eternal.getCohortAverage(), 1);
    }

    @Test
    public void testIfFindStudentByIdWorks(){
        assertEquals("Sarasa", eternal.findStudentById(3333333));
        assertEquals("N/A", eternal.findStudentById(542425));
    }
}
