interface Employee{
    void performTask(String task);
}


class Manager implements  Employee{
    String department;
    String task;

    public Manager(String department) {
        this.department=department;
    }
    @Override
    public void performTask(String task) {
        this.task=task;
        System.out.println("Manager is delegating task:"+task);
    }
}

class Developer implements Employee{
String programmingLanguage;
 public Developer(String la) {
    this.programmingLanguage=la;
    }



    @Override
    public void performTask(String task) {
        System.out.println("Developer is coding task:X using"+task);
    }


}

class Tester implements  Employee {
    String testingTool;

    public Tester(String testing) {
        this.testingTool=testing;
    }

    @Override
    public void performTask(String task) {
        System.out.println("Tester is testing task :x using "+task);
    }
    

}
public class Main_e {
public static void main(String[] args) {
    Manager m=new Manager("IT");
    Developer d=new Developer("Java");
    Tester t=new Tester("junit");
    m.performTask("code");
    d.performTask("java");
    t.performTask("Junit");
}
}
