import java.io.Serializable;

public class Car implements Serializable{
    private String licensePlate;
    private String brand;

    public Car(String licensePlate, String brand){
        this.licensePlate = licensePlate;
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{");
        sb.append("licensePlate=").append(licensePlate);
        sb.append(", brand=").append(brand);
        sb.append('}');
        return sb.toString();
    }

}