public class Developer extends Employee1{
    public Developer(String name, double salary){
        super(name, salary);
    }

    @Override
    public double calculateBonus(){
        double salary = this.getSalary() * 1.10; 
        return salary;
    } 
}
