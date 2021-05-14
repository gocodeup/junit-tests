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


}
