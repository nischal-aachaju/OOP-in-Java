// Task: Define a Employee interface with the method salary . 
// The class FullTime and PartTime Employee will be inheriting the
//  property from the parent interface.


public interface Employeess {
    void salary();
    
}

class FullTime implements Employeess{

    @Override
    public void salary() {
       System.out.println("Salary is 20000");
    }
    
}

class PartTime implements Employeess{

    @Override=
    public void salary() {
       System.out.println( "Salary is 1500/day"); 
    }

}

class Hello{
     static void main(String[] args) {
        PartTime user1=new PartTime();
        user1.salary();

        FullTime user2=new FullTime();
        user2.salary();
    }
}