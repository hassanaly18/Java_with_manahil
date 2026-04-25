public class Main {
    public static void main(String[] args) {
        SmartPhone ip17 = new SmartPhone("Apple");

        ip17.connectToWifi();
        ip17.info();
        ip17.turnOn();
        ip17.getLocation();
    }
}
