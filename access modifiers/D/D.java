package D;

public class D {
    protected String name;
    protected int age;

    protected void display(){
        System.out.println("D name:"+name);
        System.out.println("D age:"+age);
    }

    public static void main(String[] args) {
        D d=new D();
        d.name="hello";
        d.age=1;
        d.display();

    }

}

