public class Main {
    public static void main(String[] args) {
        SalaryWorker salaryWorker = new SalaryWorker("000001", "Homer", "Simpson", "Mr.", 1975, 10.00, 30000.00);
        System.out.println(salaryWorker.toCSV());
        System.out.println(salaryWorker.toJSON());
        System.out.println(salaryWorker.toXML());
        System.out.println("_______");
        System.out.println(salaryWorker.calculateWeeklyPay(30));
        System.out.println(salaryWorker.calculateWeeklyPay(40));
        System.out.println(salaryWorker.calculateWeeklyPay(50));
        System.out.println("_______");

        salaryWorker.displayWeeklyPay(50);
        salaryWorker.displayWeeklyPay(40);
    }
}