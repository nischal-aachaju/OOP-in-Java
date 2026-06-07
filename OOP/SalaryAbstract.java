abstract class Employee{
    String e_name;
    abstract double calculateSalary();
}

class FullTime extends Employee{
    @Override
    double calculateSalary(){
        return 30000;
    }
}
class Part_Time extends Employee{
    private double hour;
    private double rate;

    Part_Time(double hour,double rate){
        this.hour=hour;
        this.rate=rate;
    }

    @Override
    double calculateSalary(){
        
        return hour*rate;
    }
}

public class SalaryAbstract{
    public static void main(String [] args){
        Employee e1=new FullTime();
        e1.e_name="Samir";
        System.out.println(e1.calculateSalary());

        Employee e2=new Part_Time(24, 40);
        e2.e_name="Nischal";
       System.out.println(e2.calculateSalary());
    }
}
  