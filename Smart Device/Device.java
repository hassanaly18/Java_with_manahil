public  abstract class Device{
    String brand;

    public Device(String brand){
        this.brand = brand;
    }

    abstract void turnOn();

    void info(){
        System.out.println("Brand: "+ this.brand);
    }
}