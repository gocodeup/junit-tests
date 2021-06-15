import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testPerson(){

    }

    @Test
    public void arraytest(){
        int [] arrayOfInts = {1,2,3,4};
        int[] yetMoreInts = {1,2,3,4};

        //assertEquals(arrayOfInts, yetMoreInts);
        assertArrayEquals(arrayOfInts, yetMoreInts);
    }

}
