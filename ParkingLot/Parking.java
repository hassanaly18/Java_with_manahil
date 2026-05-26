import java.io.ObjectInputStream;
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

    @SuppressWarnings("unchecked")
    private Map<Integer, Car> loadData(){
        try {
            ObjectInputStream ois = new ObjectInputStream(FileInputStream("cars.bin"));

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
