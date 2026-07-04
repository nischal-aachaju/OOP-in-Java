

public class Employee{
    int employeeId;
    String employeeName;
    double salary;

    public Employee(int id,String name,double salary) {
        this.employeeId=id;
        this.employeeName=name;
        this.salary=salary;
    }

    
    void addBonus(double amount){
        this.salary=this.salary+amount;
    }
    void deductSalary(double amount){
        if (this.salary-amount<0){
            System.out.println("Cannot  deducet salary. ");
            return;
        }
        this.salary=this.salary-amount;

    }
    double displaySalary(){
        return  this.salary;
    }
}

class Manager extends  Employee{

    public Manager(int id,String name,double salary) {
        super(id, name,salary);
    }
    
    private double allowance;
    void addAllowance(double amount){
        this.allowance=this.allowance+amount;
        super.salary=super.salary+this.allowance;
    }
}

class Main{
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Nischal",20000);
        Manager m1=new Manager(1,"Niral",3000);
        m1.addAllowance(200);
        System.out.println(m1.displaySalary());

    }
}
