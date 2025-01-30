public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("000001", "Homer", "Simpson", "Mr.", 1975, 10.00);
        System.out.println(worker.toCSV());
        System.out.println(worker.toJSON());
        System.out.println(worker.toXML());
        System.out.println("_______");
        System.out.println(worker.calculateWeeklyPay(30));
        System.out.println(worker.calculateWeeklyPay(40));
        System.out.println(worker.calculateWeeklyPay(50));
        System.out.println("_______");

        worker.displayWeeklyPay(50);
        worker.displayWeeklyPay(40);
    }
}