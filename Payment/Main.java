public class Main{
    public static void main(String[] args) {
        Payment p;

        p = new Jazzcash();
        p.pay();

        p = new Paypal();
        p.pay();
    }
}

class Payment {
    void pay(){}    
}

class Jazzcash extends Payment{
    void pay(){
        System.out.println("Jazzcash payment");
    }
}

class Paypal extends Payment{
    void pay(){
        System.out.println("Paypal payment");
    }
}

