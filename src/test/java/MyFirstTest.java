import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {


    @Test
    public void isCodeupEqual() {
        String expected = "Codeup";
        String compared = "CodeUp";

//        assertEquals(expected, compared);
        assertNotEquals(expected, compared);
    }

        @Test

        public void areNotTheSame () {


            List<String> languages = new ArrayList<>();
            List<String> moreLanguages = new ArrayList<>();

            assertNotSame(languages, moreLanguages);

    }

    @Test

    public void arraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test

    public void isFalseOrTrue(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement


        assertTrue(language.contains("H"));
        assertFalse( language.contains("J"));

    }

}
