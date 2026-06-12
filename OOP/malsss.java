public interface malsss{
    void eat();
    void sleep();
}

interface Dogsss extends malsss {
    void bark();
    
}

class Bulldogs implements Dogsss{

    @Override
    public void eat() {
      System.out.println("Eating");
    }

    @Override
    public void sleep() {
   System.out.println( "sleeping");
    }

    @Override
    public void bark() {
       System.out.println("barking");
    }

}

class Interfacesssssss{
    public static void main(String[] args) {
        Bulldogs d1=new Bulldogs();
        d1.eat();
    }
}
