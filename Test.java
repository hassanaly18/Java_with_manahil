interface A{
    void show();
}

interface B{
    void display();
}

public class Test implements A, B{
    public void show(){
        System.out.println("Data is being shown..!");
    }

    public void display(){
        System.out.println("Data is being displayed..!");
    }
}