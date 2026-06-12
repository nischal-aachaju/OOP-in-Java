public interface Animalsss{
    void eat();
    void sleep();
}

interface Dog extends Animalsss {
    void bark();
    
}

class Bulldog implements Dog{

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

class Interfacessssss {
    public static void main(String[] args) {
        Bulldog d1=new Bulldog();
        d1.eat();
    }
}
