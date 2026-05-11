package constructor;
public class Person{
   private String name ;
   private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    
    Person(String name ,int age){
        this.name=name;
        this.age=age;

    }
    Person(){
        System.out.println("This is default construter");
    }
    void display(){
        System.out.println("name:"+name+" age:" +age);
    }
    // Person(Person p2){
    //     this.name=p2.name;
    //     this.age=p2.age;
    // }
    Person(Person p1){     
        this.name=p1.name;
        this.age=p1.age;
    }
}

class MainClass{
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("gdg");
        p1.setAge(19);
        System.out.println(p1.getAge()+p1.getName());
    }
}