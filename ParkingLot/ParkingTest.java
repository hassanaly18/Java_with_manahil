import java.util.Scanner;

public class ParkingTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Parking parking = new Parking(10);

        int option;

        do{
            System.out.println("1. Set Parking space \n2. Release Parking Space \n3. Display Garage \n4. Exit \nSelect an option: ");
            option = input.nextInt();
            input.nextLine();

            switch(option){
                case 1:
                    System.out.println("Enter License Plate: ");
                    String plate = input.nextLine();

                    System.out.println("Enter Brand: ");
                    String brand = input.nextLine();

                    Car car = new Car(plate, brand);
                    parking.setParkingSpace(car);
                    break;
                
                case 2:
                    System.out.println("Enter license plate: ");
                    String removePlate = input.nextLine();
                    parking.releaseParkingSpace(removePlate); 
                    break;

                case 3:
                    parking.displayGarage();
                    break;
                
                case 4:
                    parking.saveData();
                    break;
                default:
                    System.out.println("Choose a correct option(1-4)");
            }
        }while(option!=4);
        input.close();
    }
}