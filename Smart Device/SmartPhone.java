public class SmartPhone extends Device implements Internet, GPS{
    public SmartPhone(String brand){
        super(brand);
    }

    public void connectToWifi(){
        System.out.println("Connected to wifi..!");
    }

    public void getLocation(){
        System.out.println("Fetching GPS Location");
    }

    public void turnOn(){
        System.out.println("Smartphone is turning on..!");
    }
}