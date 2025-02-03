import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker salaryWorker1, salaryWorker2, salaryWorker3;

    @BeforeEach
    void setUp() {
        salaryWorker1 = new SalaryWorker("000001", "TestFirst1", "TestLast1", "Mr.", 1970, 20.0, 52000.0);
        salaryWorker2 = new SalaryWorker("000001", "TestFirst1", "TestLast1", "Mr.", 1970, 20.0, 52000.0);
        salaryWorker3 = new SalaryWorker("000002", "TestFirst2", "TestLast2", "ms.", 1980, 25.0, 102000.0);
    }

    @Test
    void setAnnualSalary() {
        salaryWorker1.setAnnualSalary(23.0);
        assertEquals(salaryWorker1.getAnnualSalary(), 23.0);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1000.0, salaryWorker1.calculateWeeklyPay(40));
    }

    @Test
    void toCSV() {
        assertEquals(salaryWorker1.toCSV(), "000001, TestFirst1, TestLast1, Mr., 1970, 20.0, 52000.0");
    }

    @Test
    void toJSON() {
        assertEquals(salaryWorker1.toJSON(), "{\"ID\":\"000001\", \"firstName\":\"TestFirst1\", \"lastName\":\"TestLast1\", \"title\":\"Mr.\", \"YOB\":1970, \"hourlyPayRate\":20.0, \"annualSalary\":52000.0}");
    }

    @Test
    void toXML() {
        assertEquals(salaryWorker1.toXML(), "<SalaryWorker><ID>000001</ID><firstName>TestFirst1</firstName><lastName>TestLast1</lastName><title>Mr.</title><YOB>1970</YOB><hourlyPayRate>20.0</hourlyPayRate><annualSalary>52000.0</annualSalary></SalaryWorker>");
    }

    @Test
    void testToString() {
        assertEquals(salaryWorker1.toString(), "SalaryWorker{ID='000001', firstName='TestFirst1', lastName='TestLast1', title='Mr.', YOB=1970, hourlyPayRate=20.0, annualSalary=52000.0}");
    }

    @Test
    void testEquals() {
        assertEquals(salaryWorker1, salaryWorker2);
        assertNotEquals(salaryWorker1, salaryWorker3);
    }

    @Test
    void testHashCode() {
        assertEquals(salaryWorker1.hashCode(), salaryWorker2.hashCode());
        assertNotEquals(salaryWorker1.hashCode(), salaryWorker3.hashCode());
    }
}