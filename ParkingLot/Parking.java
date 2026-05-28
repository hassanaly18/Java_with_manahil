import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Parking {
    private String[] parkingSlots;
    private Map<Integer, Car> parkedCars;

    public Parking(int size) {
        parkingSlots = new String[size];
        parkedCars = loadData();

        for (Map.Entry<Integer, Car> entry: parkedCars.entrySet()) {
            int slot = entry.getKey();
            parkingSlots[slot] = entry.getValue().getLicensePlate();
        }
        
    }

    public void displayGarage(){
        System.out.println("\nGarage Status:\n");
        for (int i = 0; i < parkingSlots.length; i++) {
            if(parkingSlots[i] == null){
                System.out.println("Slot " + i + " -> Free");
            }
            else{
                System.out.println("Slot " + i + " -> " + parkingSlots[i]);
            }
        }
    }

    public void setParkingSpace(Car car){
        for (int i = 0; i < parkingSlots.length; i++) {
            if(parkingSlots[i] == null){
                parkingSlots[i] = car.getLicensePlate();

                parkedCars.put(i, car);
                System.out.println("Car parked at slot: " + i);
            
                return;
            }
        }
        System.out.println("Parking is full!");
    }

    public void releaseParkingSpace(String licensePlate){
        for(int i=0; i<parkingSlots.length; i++){
            if(parkingSlots[i] != null && parkingSlots[i].equalsIgnoreCase(licensePlate)){
                parkingSlots[i] = null;
                parkedCars.remove(i);
                System.out.println("Parking slot released..!");
                return;
            }
        }
        System.out.println("Car not found..!");
    }

    public void saveData(){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cars.bin"));
            oos.writeObject(parkedCars);
            oos.close();
            System.out.println("Data saved successfully");
        }
        catch(IOException e){
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private Map<Integer, Car> loadData(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cars.bin"));

            Map<Integer, Car> map = (HashMap<Integer, Car>) ois.readObject();
            ois.close();

            System.out.println("Data loaded successfully");
            return map;
        } catch (Exception e) {
            System.out.println("No data found..!");
            return new HashMap<>();
        }
    }

    
}
