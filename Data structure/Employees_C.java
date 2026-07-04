abstract  class Employee{
    abstract  double calculateSalary();
    abstract void work();
    public void display(){
        work();
        System.out.println(": $"+calculateSalary());
    };
}

class FullTimeEmployee extends  Employee{
    String name;
    double monthlySalary;
    
    public FullTimeEmployee(String name ,double monthlySalary) {
        this.monthlySalary=monthlySalary;
        this.name=name;
    }

    @Override
    double calculateSalary() {
       return monthlySalary;
    }
    @Override
    void work() {
        System.out.print("Full Time Employee,"+ this.name);
    }

}

class PartTimeEmployee extends  Employee{
    String name;
    int hoursWorked;
    double ratePerHour;
    
    

    public PartTimeEmployee(String name,double amt,int hour) {
        this.hoursWorked=hour;
        this.ratePerHour=amt;
        this.name=name;
    }
    @Override
    void work(){
    System.out.print("Part Time Employee,"+ this.name);
    }

    @Override
    double calculateSalary() {
        return  hoursWorked*ratePerHour;
    }
}

public class Employees_C {
    public static void main(String[] args) {
        FullTimeEmployee f1=new FullTimeEmployee("Nischal",1000);
        PartTimeEmployee p1=new PartTimeEmployee("Nirjal",5,8);
        f1.display();
        p1.display();

    }
}
