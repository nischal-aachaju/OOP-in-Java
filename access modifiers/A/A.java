package A;

public class A {
    private String name;
    private int age;
    private void display (){
        System.out.println(name);
        System.out.println(age);

    }
    public static void main(String[] args) {
        A ab=new A();
        ab.name="Nischal";
        ab.age=13;
        ab.display();

    }
}
