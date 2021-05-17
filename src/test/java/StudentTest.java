import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
            public void StudentTest() {
        Student me = new Student(11, "Manii");
        Student nullMe = null;
        assertNotNull(me);
        assertNull(nullMe);
    }

    @Test
    public void SettersGettersTest(){
        Student me = new Student(11, "Manii");
        assertEquals(11, me.getId());
        assertEquals("Manii", me.getName());

        Student her = new Student(12, "Stephanie");
        assertEquals(12, her.getId());
        assertEquals("Stephanie", her.getName());
    }

   @Test
    public void AddGradeTest(){
       Student me = new Student(11, "Manii");
       assertEquals(0, me.addGrade().size());
       me.addGrade(60);
       assertEquals(1, me.addGrade().size());
       me.addGrade(75);
   }

    @Test
    public void AddGetTest(){
        Student me = new Student(11, "Manii");
        me.addGrade(75);
        me.addGrade(60);
       assertSame(75, me.getGrades().get(0));
        assertSame(60, me.getGrades().get(1));
    }

    @Test
    public void getAverageTest(){
        Student me = new Student(11, "Manii");
        me.addGrade(90);
        me.addGrade(80);
        assertEquals(80, me.getGradeAverage(), 0);
        me.addGrade(50);
        assertEquals(60, me.getGradeAverage(), 0);
    }
}
