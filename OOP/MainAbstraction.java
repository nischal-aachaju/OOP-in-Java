abstract class AbstractionExample {

    String name;
    // abstract void method(){
    //      System.out.println("Hello");
    //  }
    //
    AbstractionExample(String name) {
        this.name = name;
        System.out.println("Hello " + name);
    }

    abstract void method();

    abstract void display();

    void displayOnce() {
        System.out.println("display");
    }
}

class ImplementationAbstract extends AbstractionExample {

    ImplementationAbstract(String name) {
        super(name);
    }

    @Override
    void method() {
        System.out.println("hello, method");
    }

    @Override
    void display() {
        System.out.println("Hello,  ");
    }
}

public class MainAbstraction {

    public static void main(String[] args) {
        ImplementationAbstract ab = new ImplementationAbstract("Jorban");
        ab.method();
        ab.display();
        ab.displayOnce();
    }
}
