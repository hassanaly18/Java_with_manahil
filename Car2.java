class Car2 extends Vehicle{
    int speed = 100;

    void display(){
        System.out.println("Car speed: "+ speed);
        System.out.println("Car speed: "+ super.speed);
        super.hello();
    }
}