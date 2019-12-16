

    import org.junit.Test;

import static org.junit.Assert.*;

    public class StudentTest {
        @Test
        public void testCreateStudent(){
            Student Fez = new Student(1L, "Fez");
            Student will = null;
            assertNull(will);
            assertNotNull(Fez);
        }

        @Test
        public void testStudents(){
            Student fer = new Student(1L, "Fez");
            assertSame(1L, fer.getId());
            assertSame("Fez", fer.getName());
            assertSame(0, fer.getGrades().size());
        }


        @Test
        public void testAddGrade(){
            Student fez = new Student(1L, "Fez");
            fez.addGrade(100);
            assertSame(100, fez.getGrades().get(0));
            fez.addGrade(80);
            assertSame(80, fez.getGrades().get(1));
        }

        @Test
        public void testAverageGrade(){
            Student fez = new Student(1L, "Fez");
            fez.addGrade(100);
            fez.addGrade(80);
            assertEquals(90, fez.getGradeAverage(), 0);
        }
    }

