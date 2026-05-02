public abstract class Employee1 {
    private String name;
    private double salary;

    public Employee1(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void setName(String name){
        this.name = name;
    }
    void setSalary(double salary){
        this.salary = salary;
    }

    String getName(){
        return this.name;
    }
    double getSalary(){
        return this.salary;
    }

    public abstract double calculateBonus();

}
