public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(12, 4));
        System.out.println(c.add(12, 4, 7));
        System.out.println(c.add(12.87, 4.12));
    }    
}
