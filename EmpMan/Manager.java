//package EmpMan;

public class Manager extends Employee1{
    public Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    public double calculateBonus(){
        return this.getSalary() * 1.20;
    } 

}
