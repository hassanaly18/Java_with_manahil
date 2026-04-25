public class Method{
    public static void main(String[] args) {
        System.out.println(add(78, 18));
        System.out.println(add(78, 18, 76));
        
    }

    //method with return type
    static int add(int a, int b){
        return a+b;
    }

    //method overloading
    static int add(int a, int b, int c){
        return a+b+c;
    }


}