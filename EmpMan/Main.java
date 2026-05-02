public class Main {
    public static void main(String[] args) {
        Manager bob = new Manager("Bob", 12500.00);
        Developer mark = new Developer("Mark", 17500.00);

        System.out.println(bob.calculateBonus());
        System.out.println(mark.calculateBonus());
    }
}
