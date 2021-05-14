package junittesting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class StudentTest{
    private Student student1;
    @Before
    public void setup(){
        this.student1 = new Student();
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(1);
        grades.add(2);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        this.student1.id = 123456;
        this.student1.name = "Andrew";
        this.student1.grades = grades;
    }
    @Test
    public void testGetId(){
        assertEquals(123456, student1.getId());
    }
    @Test
    public void testGetName(){
        assertEquals("Andrew", student1.getName());
    }
    @Test
    public void testAddGrade(){
        List<Integer> testGrades = new ArrayList<Integer>();
        testGrades.add(1);
        testGrades.add(2);
        testGrades.add(3);
        testGrades.add(4);
        testGrades.add(5);
        assertEquals(testGrades, this.student1.grades);
        testGrades.add(9);
        this.student1.addGrade(9);
        assertEquals(testGrades, this.student1.grades);
    }
    @Test
    public void testGetGrades(){
        List<Integer> testGrades = new ArrayList<Integer>();
        testGrades.add(1);
        testGrades.add(2);
        testGrades.add(3);
        testGrades.add(4);
        testGrades.add(5);
        assertEquals(testGrades, this.student1.getGrades());
    }
    @Test
    public void testGetGradeAverage(){
        assertEquals(3.0, this.student1.getGradeAverage(), 0);
    }
}