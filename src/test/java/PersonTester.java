import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PersonTester {

    private ArrayList<Person> people;

    @Before
    public void setUp(){
        this.people = new ArrayList<>();
        people.add(new Person("Joe", true));
        people.add(new Person("David", false));
        Person dave = new Person("Dave", true);
        people.add(dave);
        people.add(dave);
        people.add(new Person("Dave", true));
    }

    @Test
    public void testPerson() {
//        Person dave =  new Person("Dave", true);
//        Person dave2 = new Person("Dave", true);
//        Person daveInAPartyHat = dave;

        assertEquals("Dave", this.people.get(2).getName());
        assertSame(this.people.get(2), this.people.get(3));
    }

    @Test
    public void arrayTest(){
        int[] arrayOfInts = {1, 2, 3, 4};
        int[] yetMoreInts = {1, 2, 3, 4};

//        assertEquals(arrayOfInts, yetMoreInts); // has issue because it compares the location in memory
        assertArrayEquals(arrayOfInts, yetMoreInts);
        // ^ This method loops through array and compares arrays
        // checks both the length and the value

    }

    @Test
    public void testForCool(){
//        Person joeCool = new Person("Joe", true);
//        Person instructorDavid =  new Person("David", false);

        assertTrue(this.people.get(0).isCool());
        assertTrue("Joe is super cool.", this.people.get(0).isCool());
        assertFalse("David has never been cool.", this.people.get(1).isCool());
    }
}
