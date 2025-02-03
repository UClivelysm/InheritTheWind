import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WorkerTest {
    Worker worker1, worker2, worker3;

    @BeforeEach
    void setUp() {
        worker1 = new Worker("000001", "TestFirst1", "TestLast1", "Mr.", 1970, 20.0);
        worker2 = new Worker("000001", "TestFirst1", "TestLast1", "Mr.", 1970, 20.0);
        worker3 = new Worker("000002", "TestFirst2", "TestLast2", "ms.", 1980, 25.0);
    }
    @Test
    void testSetHourlyPayRate(){
        worker1.setHourlyPayRate(23.0);
        assertEquals(23.0, worker1.getHourlyPayRate());
    }
    @Test
    void testToCSV(){
        assertEquals(worker1.toCSV(), "000001, TestFirst1, TestLast1, Mr., 1970, 20.0");
    }
    @Test
    void testToJSON(){
        assertEquals(worker1.toJSON(), "{\"ID\":\"000001\", \"firstName\":\"TestFirst1\", \"lastName\":\"TestLast1\", \"title\":\"Mr.\", \"YOB\":1970, \"hourlyPayRate\":20.0}");
    }
    @Test
    void testToXML(){
        assertEquals(worker1.toXML(), "<Worker><ID>000001</ID><firstName>TestFirst1</firstName><lastName>TestLast1</lastName><title>Mr.</title><YOB>1970</YOB><hourlyPayRate>20.0</hourlyPayRate></Worker>");
    }

    @Test
    public  void testCalculateWeeklyPay() {
        assertEquals(worker1.calculateWeeklyPay(10), 200.0);
        assertEquals(worker1.calculateWeeklyPay(50), 1100.0);
    }

    @Test
    public void testToString() {
        String expectedString = "Worker{ID='000001', firstName='TestFirst1', lastName='TestLast1', title='Mr.', YOB=1970, hourlyPayRate=20.0}";
        assertEquals(expectedString, worker1.toString());
    }

    @Test
    void testEquals() {
        assertTrue(worker1.equals(worker2));

        assertFalse(worker1.equals(worker3));

        assertFalse(worker1.equals(null));

        assertFalse(worker1.equals("string"));
    }

    @Test
    void testHashCode() {
        assertEquals(worker1.hashCode(), worker2.hashCode());

        assertTrue(worker1.hashCode() !=worker3.hashCode());
    }
}
