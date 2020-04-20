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
    public void setup(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student fer = new Student(1, "Fer M");
        fer.addGrade(90);

        Student trant = new Student(2, "Trant B");
        trant.addGrade(100);
        trant.addGrade(100);
        trant.addGrade(100);

        cohortWithOne.addStudent(fer);
        cohortWithMany.addStudent(fer);
        cohortWithMany.addStudent(trant);
    }

    @Test
    public void testAddStudentAndGetStudentsWork(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().get(0).getId());
    }

    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);
    }

    @Test
    public void testIfStudentListIsCorrect(){
        assertTrue(emptyCohort.getStudents().isEmpty());
        int counter = 0;
        for (Student student : cohortWithOne.getStudents()) {
            assertSame(student.getId(),cohortWithOne.getStudents().get(counter).getId());
            assertSame(student.getName(),cohortWithOne.getStudents().get(counter).getName());
            assertSame(student.getGrades(),cohortWithOne.getStudents().get(counter).getGrades());
            assertEquals(student.getGradeAverage(),cohortWithOne.getStudents().get(counter).getGradeAverage(),0);
            counter++;
        }
        counter = 0;
        for (Student student : cohortWithMany.getStudents()) {
            assertSame(student.getId(),cohortWithMany.getStudents().get(counter).getId());
            assertSame(student.getName(),cohortWithMany.getStudents().get(counter).getName());
            assertSame(student.getGrades(),cohortWithMany.getStudents().get(counter).getGrades());
            assertEquals(student.getGradeAverage(),cohortWithMany.getStudents().get(counter).getGradeAverage(),0);
            counter++;
        }
    }

}