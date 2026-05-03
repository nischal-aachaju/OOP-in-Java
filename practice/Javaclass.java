public class Javaclass {
    public static void main(String[] args){
        System.out.println("hello main class");
        Student s1=new Student();
        Student s2=new Student();
        s2.name="Hello";
        s2.age=25;
        s1.name="Nischal Shrestha";
        s1.age=19;
        s1.display();
        s1.display();
        s2.display();
    }

}
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}