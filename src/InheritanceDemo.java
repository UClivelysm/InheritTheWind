import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        Worker worker1 = new Worker("000001", "Bill", "Gates", "Mr.", 1955, 19.75);
        Worker worker2 = new Worker("000002", "Steve", "Ballmer", "Mr.", 1956, 20.00);
        Worker worker3 = new Worker("000003", "Satya", "Nadella", "Mr.", 1967, 20.14);

        SalaryWorker salaryWorker1 = new SalaryWorker("000004", "Eric", "Schmidt", "Mr.", 1955, 20.01, 20110);
        SalaryWorker salaryWorker2 = new SalaryWorker("000005", "Larry", "Page", "Mr.", 1973, 20.11, 20150);
        SalaryWorker salaryWorker3 = new SalaryWorker("000005", "Sundar", "Pichai", "Mr.", 1972, 20.15, 20250);
        ArrayList <Worker> workers  = new ArrayList();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        for (int days = 3; days > 0; days--) {
            if(days == 3){
                double hoursWorked = 40;
                System.out.println("Week 1");
                System.out.println("ID#    FirstName LastName HoursWorked WeeklyPay\n" +
                                   "_______________________________________________");
                for (Worker worker : workers) {
                    System.out.printf("\n%-7s%-10s%-9s%-12s%-7.2f", worker.getID(), worker.getFirstName(), worker.getLastName(), hoursWorked, worker.calculateWeeklyPay(hoursWorked));

                }
            }else if(days == 2){
                double hoursWorked = 50;
                System.out.println("\n");
                System.out.println("Week 2");
                System.out.println("ID#    FirstName LastName HoursWorked WeeklyPay\n" +
                                   "_______________________________________________");
                for (Worker worker : workers) {
                    System.out.printf("\n%-7s%-10s%-9s%-12s%-7.2f", worker.getID(), worker.getFirstName(), worker.getLastName(), hoursWorked, worker.calculateWeeklyPay(hoursWorked));

                }
            }else {
                double hoursWorked = 40;
                System.out.println("\n");
                System.out.println("Week 3");
                System.out.println("ID#    FirstName LastName HoursWorked WeeklyPay\n" +
                                   "_______________________________________________");
                for (Worker worker : workers) {
                    System.out.printf("\n%-7s%-10s%-9s%-12s%-7.2f", worker.getID(), worker.getFirstName(), worker.getLastName(), hoursWorked, worker.calculateWeeklyPay(hoursWorked));

                }
                System.out.println("");
            }
        }

    }
}
