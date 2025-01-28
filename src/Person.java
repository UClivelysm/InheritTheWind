import java.time.Year;
import java.util.Objects;
//might also want to create to json/XML
public class Person {

    private String ID ="";
    private String firstName ="";
    private String lastName ="";
    private String title ="";
    private int YOB;

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;

        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }


    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }

    public String getFormalName(){
        return this.getTitle() + " " + this.getFullName();
    }

    public int getAge(){
        int currentYear = Year.now().getValue();
        return currentYear - this.YOB;
    }
    public int getAge(int Year){
        return Year - this.YOB;
    }

    public String toCSV(){
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }
    public String toJSON(){
        String retString ="";
        char DQ = '\u0022';
        retString = "{" +DQ+ "ID" + DQ+ ":" +DQ+ this.ID + DQ+ ",";
        retString += " " +DQ+ "firstName" +DQ+ ":" +DQ+ this.firstName +DQ+ ",";
        retString += " " +DQ+ "lastName" +DQ+ ":" +DQ+ this.lastName +DQ+ ",";
        retString += " " +DQ+ "title" +DQ+ ":" +DQ+ this.title +DQ+ ",";
        retString += " " +DQ+ "YOB" +DQ+ ":" + this.YOB +"}";
        return retString;
    }
    public String toXML(){
        String retString ="";

        retString = "<Person>";
        retString += "<ID>" + this.ID + "</ID>";
        retString += "<firstName>" + this.firstName + "</firstName>";
        retString += "<lastName>" + this.lastName + "</lastName>";
        retString += "<title>" + this.title + "</title>";
        retString += "<YOB>" + this.YOB + "</YOB>";
        retString += "</Person>";
        return retString;
    }



    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && Objects.equals(ID, person.ID) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(title, person.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, firstName, lastName, title, YOB);
    }
}
