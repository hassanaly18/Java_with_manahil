//Multi-level inheritance
public class A{
    void methodA(){
        System.out.println("A");
    }
}

class B extends A{
    void methodB(){
        System.out.println("B");
    }
}

class C extends B{
    void methodC(){
        System.out.println("C");
    }
}