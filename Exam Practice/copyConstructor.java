class employee{
    String name;
    int age;

    public employee(String name,int age) {
    this.name=name;
    this.age=age;
    }
    
}


class manager{
    String name;
    int age;
    
    manager(String name,int age){
        this.name=name;
        this.age=age;
    }
    manager(employee e){
        this.name=e.name;
        this.age=e.age;
    }
}

public class copyConstructor {
public static void main(String[] args) {
    employee e1=new employee("Nischal",12);
    manager m1=new manager("nIRJAL",14);
    manager m2=new manager(e1);
    System.out.println(m2.name);
    System.out.println(e1.name);
}
    
}
