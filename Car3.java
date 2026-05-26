// 4 pillars of OOP

// Encapsulation
// Inheritance
// Abstraction
// Polymorphism

public class Car {
    private String name;
    private String brand;
    private String color;
    static int count = 0;

    public Car(String name, String brand, String color){ //constructor
        this.name = name;
        this.brand = brand;
        this.color = color;
        count++;
    }

    public void show(){ //instance
        System.out.println("Car's name: "+ this.name);
        System.out.println("Car'brand: "+ this.brand);
        System.out.println("Car's color: "+ this.color);
    }

    public static void show2(){
        System.out.println("Number of objects of Car: " + count);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " Brand: " + this.name + " Color: " + this.color;
    }
}


