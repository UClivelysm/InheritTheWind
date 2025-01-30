import java.util.Objects;

public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    double calculateWeeklyPay(double hoursWorked) {
    if(hoursWorked <= 40){
        return hourlyPayRate * hoursWorked;
    }
    else {
        double carry = hourlyPayRate * 40;
        hoursWorked = hoursWorked - 40;
        return ((hourlyPayRate * hoursWorked)*1.5) + carry;
    }
}
void displayWeeklyPay(double hoursWorked){
    if(hoursWorked <= 40){
        System.out.println("Regular pay hours (" + hoursWorked + ") $" + hourlyPayRate * hoursWorked);
    }
    else {
        double overtimeHours = hoursWorked - 40;
        System.out.println("Regular pay hours (40) $" + hourlyPayRate * 40);
        System.out.println("Overtime pay hours (" + overtimeHours + ") $" + (hourlyPayRate * overtimeHours)*1.5);

        //return ((hourlyPayRate * hoursWorked)*1.5) + carry;
    }
}

@Override
    public String toCSV(){
        return super.getID() + ", " + super.getFirstName() + ", " + super.getLastName() + ", " + super.getTitle() + ", " + super.getYOB() + ", " + hourlyPayRate;
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
    retString += " " +DQ+ "hourlyPayRate" +DQ+ ":" + hourlyPayRate +"}";
    return retString;
}
public String toXML(){
    String retString ="";

    retString = "<Worker>";
    retString += "<ID>" + super.getID() + "</ID>";
    retString += "<firstName>" + super.getFirstName() + "</firstName>";
    retString += "<lastName>" + super.getLastName() + "</lastName>";
    retString += "<title>" + super.getTitle() + "</title>";
    retString += "<YOB>" + super.getYOB() + "</YOB>";
    retString += "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate>";
    retString += "</Worker>";
    return retString;
}



@Override
public String toString() {
    return "Worker{" +
            "ID='" + super.getID() + '\'' +
            ", firstName='" + super.getFirstName() + '\'' +
            ", lastName='" + super.getLastName() + '\'' +
            ", title='" + super.getTitle() + '\'' +
            ", YOB=" + super.getYOB() + "\'" +
            ", hourlyPayRate=" + hourlyPayRate +
            '}';
}

@Override
public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Worker worker = (Worker) o;
    return super.getID() == worker.getID() && Objects.equals(super.getID(), worker.getID()) && Objects.equals(super.getFirstName(), worker.getFirstName()) && Objects.equals(super.getLastName(), worker.getLastName()) && Objects.equals(super.getTitle(), worker.getTitle()) && Objects.equals(hourlyPayRate, worker.hourlyPayRate);
}

@Override
public int hashCode() {
    return Objects.hash(super.getID(), super.getFirstName(), super.getLastName(), super.getTitle(), super.getYOB(), hourlyPayRate);
}
}
