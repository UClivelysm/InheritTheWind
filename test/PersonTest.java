import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person1, person2, person3;

    @BeforeEach
    void setUp() {
        person1 = new Person("000001", "TestFirst1", "TestLast1", "Mr.", 1970);
        person2 = new Person("000001", "TestFirst1", "TestLast1", "Mr.", 1970);
        person3 = new Person("000002", "TestFirst2", "TestLast2", "ms.", 1980);
    }

    @Test
    void setID() {
        person1.setID("000004");
        assertEquals("000004", person1.getID());
    }

    @Test
    void setFirstName() {
        person1.setFirstName("alteredName");
        assertEquals("alteredName", person1.getFirstName());
    }

    @Test
    void setLastName() {
        person1.setLastName("alteredLastName");
        assertEquals("alteredLastName", person1.getLastName());
    }

    @Test
    void setTitle() {
        person1.setTitle("Dr.");
        assertEquals("Dr.", person1.getTitle());
    }

    @Test
    void setYOB() {
        person1.setYOB(2038);
        assertEquals(2038, person1.getYOB());
    }


    @Test
    public void testToString() {
        String expectedString = "Person{ID='000001', firstName='TestFirst1', lastName='TestLast1', title='Mr.', YOB=1970}";
        assertEquals(expectedString, person1.toString());
    }

    @Test
    void testEquals() {
        assertTrue(person1.equals(person2));

        assertFalse(person1.equals(person3));

        assertFalse(person1.equals(null));

        assertFalse(person1.equals("string"));
    }

    @Test
    void testHashCode() {
        assertEquals(person1.hashCode(), person2.hashCode());

        assertTrue(person1.hashCode() !=person3.hashCode());
    }

    @Test
    void getFullName() {
        assertEquals("TestFirst1 TestLast1", person1.getFullName());
    }

    @Test
    void getFormalName() {
        assertEquals("Mr. TestFirst1 TestLast1", person1.getFormalName());
    }

    @Test
    void getAge() {

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        int expectedAge = currentYear - person1.getYOB();
        assertEquals(expectedAge, person1.getAge(currentYear));
    }

    @Test
    void testGetAge() {
        assertEquals(20, person1.getAge(1990));

    }
}