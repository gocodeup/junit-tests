

    import org.junit.Before;
    import org.junit.Test;

import static org.junit.Assert.*;

    public class StudentTest {
        Student will = new Student(1L, "William");

        @Before
        public void setup (){
            will.addGrade(100);
            will.addGrade(80);
        }

        @Test
        public void testCreateStudent(){
            Student fez = null;
            assertNull(fez);
            assertNotNull(will);
        }

        @Test
        public void testStudents(){
            assertSame(1L, will.getId());
            assertSame("William", will.getName());
            assertSame(0, will.getGrades().size());
        }


        @Test
        public void testAddGrade(){
            assertSame(100, will.getGrades().get(0));
            assertSame(80, will.getGrades().get(1));
        }

        @Test
        public void testAverageGrade(){
            assertEquals(90, will.getGradeAverage(), 0);
        }
    }

