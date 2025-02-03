import java.util.Objects;
public class SalaryWorker extends Worker {
    private Double annualSalary;

    public Double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked){
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked){
        System.out.println("This week's pay is " + calculateWeeklyPay(hoursWorked) + "or 1/52 of the annual salary of " + annualSalary);
    }





    @Override
    public String toCSV(){
        return super.getID() + ", " + super.getFirstName() + ", " + super.getLastName() + ", " + super.getTitle() + ", " + super.getYOB() + ", " + super.getHourlyPayRate() + ", " + annualSalary;
    }


    @Override
    public String toJSON(){
        String retString ="";
        char DQ = '\u0022';
        retString = "{" +DQ+ "ID" + DQ+ ":" +DQ+ super.getID() + DQ+ ",";
        retString += " " +DQ+ "firstName" +DQ+ ":" +DQ+ super.getFirstName() +DQ+ ",";
        retString += " " +DQ+ "lastName" +DQ+ ":" +DQ+ super.getLastName() +DQ+ ",";
        retString += " " +DQ+ "title" +DQ+ ":" +DQ+ super.getTitle() +DQ+ ",";
        retString += " " +DQ+ "YOB" +DQ+ ":" + super.getYOB() + ",";
        retString += " " +DQ+ "hourlyPayRate" +DQ+ ":" + super.getHourlyPayRate() + ",";
        retString += " " +DQ+ "annualSalary" +DQ+  ":" + annualSalary + "}";
        return retString;
    }
    public String toXML(){
        String retString ="";

        retString = "<SalaryWorker>";
        retString += "<ID>" + super.getID() + "</ID>";
        retString += "<firstName>" + super.getFirstName() + "</firstName>";
        retString += "<lastName>" + super.getLastName() + "</lastName>";
        retString += "<title>" + super.getTitle() + "</title>";
        retString += "<YOB>" + super.getYOB() + "</YOB>";
        retString += "<hourlyPayRate>" + super.getHourlyPayRate() + "</hourlyPayRate>";
        retString += "<annualSalary>" + annualSalary + "</annualSalary>";
        retString += "</SalaryWorker>";
        return retString;
    }



    @Override
    public String toString() {
        return "SalaryWorker{" +
                "ID='" + super.getID() + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", title='" + super.getTitle() + '\'' +
                ", YOB=" + super.getYOB()  +
                ", hourlyPayRate=" + super.getHourlyPayRate() +
                ", annualSalary=" + annualSalary +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SalaryWorker salaryWorker = (SalaryWorker) o;
        return super.getID() == salaryWorker.getID() && Objects.equals(super.getID(), salaryWorker.getID()) && Objects.equals(super.getFirstName(), salaryWorker.getFirstName()) && Objects.equals(super.getLastName(), salaryWorker.getLastName()) && Objects.equals(super.getTitle(), salaryWorker.getTitle()) && Objects.equals(super.getHourlyPayRate(), salaryWorker.getHourlyPayRate()) && Objects.equals(annualSalary, salaryWorker.annualSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getID(), super.getFirstName(), super.getLastName(), super.getTitle(), super.getYOB(), super.getHourlyPayRate(), annualSalary);
    }
}
