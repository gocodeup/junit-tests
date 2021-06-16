import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort cohort;
    private Student stud;
    private Student jenn;
    private Student jim;

    @Before
    public void setUp() {
        this.cohort = new Cohort();
        this.stud = new Student(1, "Stud Body");
        this.jenn = new Student(12, "Jenn Ann Hologram");
        this.jim = new Student(7, "Jim Johnly");
        stud.addGrade(50);
        stud.addGrade(75);
        stud.addGrade(25);
        jenn.addGrade(100);
        jenn.addGrade(100);
        jenn.addGrade(100);
    }


    @Test
    public void testAddStudent() {
        cohort.addStudent(jim);
        assertEquals(1, cohort.getStudents().size());
        cohort.addStudent(jenn);
        assertEquals(2, cohort.getStudents().size());
        cohort.addStudent(stud);
        assertEquals(stud, cohort.getStudents().get(2));
    }

    @Test
    public void testGetStudents() {
        cohort.addStudent(jim);
        cohort.addStudent(jenn);
        cohort.addStudent(stud);
        assertEquals(3, cohort.getStudents().size());
        assertEquals("Jim Johnly", cohort.getStudents().get(0).getName());
    }

    @Test
    public void testGetCohortAverage() {
        cohort.addStudent(stud);
        cohort.addStudent(jenn);
        assertEquals(75, cohort.getCohortAverage(), 0);
    }
}