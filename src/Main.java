public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("000001", "TestFirst1", "TestLast1", "Mr.", 1970);
        Worker worker1 = new Worker("000001", "TestFirst1", "TestLast1", "Mr.", 1970, 20.0);
        SalaryWorker salaryWorker1 = new SalaryWorker("000001", "TestFirst1", "TestLast1", "Mr.", 1970, 20.0, 52000.0);



        System.out.println(salaryWorker1.toCSV());
        System.out.println(salaryWorker1.toJSON());
        System.out.println(salaryWorker1.toXML());
        System.out.println(salaryWorker1.toString());

//        System.out.println("_______");
//       System.out.println(salaryWorker.calculateWeeklyPay(30));
//        System.out.println(salaryWorker.calculateWeeklyPay(40));
//        System.out.println(salaryWorker.calculateWeeklyPay(50));
//        System.out.println("_______");
//
//        salaryWorker.displayWeeklyPay(50);
//        salaryWorker.displayWeeklyPay(40);

    }
}