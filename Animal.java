//Hierarchical inheritance
public class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking..!");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing");
    }
}

//######################################################################
//######################################################################


class A{
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