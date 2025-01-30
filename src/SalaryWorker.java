import java.util.Objects;
public class SalaryWorker extends Worker {
    private Double annualSalary;
    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
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
        retString += " " +DQ+ "YOB" +DQ+ ":" + super.getYOB() +DQ+ ",";
        retString += " " +DQ+ "hourlyPayRate" +DQ+ ":" + super.getHourlyPayRate() +DQ+ ",";
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
                ", YOB=" + super.getYOB() + "\'" +
                ", hourlyPayRate=" + super.getHourlyPayRate() + "\'" +
                ", annualSalary=" + annualSalary +
                '}';
    }
//Change the following 2 overrides to work with annualSalary
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return super.getID() == worker.getID() && Objects.equals(super.getID(), worker.getID()) && Objects.equals(super.getFirstName(), worker.getFirstName()) && Objects.equals(super.getLastName(), worker.getLastName()) && Objects.equals(super.getTitle(), worker.getTitle()) && Objects.equals(super.getHourlyPayRate(), worker.getHourlyPayRate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getID(), super.getFirstName(), super.getLastName(), super.getTitle(), super.getYOB(), super.getHourlyPayRate());
    }
}
