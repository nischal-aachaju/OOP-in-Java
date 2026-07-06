// Interface definition
interface Flyable {
    void fly(); // Implicitly public and abstract

    default void land(){
        System.out.println("landing....");
    }
    static void brake(){
        System.out.println("Stoping ....");
    }
}

// Concrete Class 1 (An Airplane is a machine)
class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("The airplane engages jet engines to take off.");
    }
}

// Concrete Class 2 (An Eagle is an animal)
class Eagle implements Flyable {
    @Override
    public void fly() {
        System.out.println("The eagle soars using wind currents.");
    }
}

// Execution
public class FlyInterface {
    public static void main(String[] args) {
        // Flyable f = new Flyable(); // ❌ ERROR: Cannot instantiate directly
        
        Flyable machine = new Airplane();
        Flyable bird = new Eagle();
        
        machine.fly(); // Output: The airplane engages jet engines to take off.
        bird.fly();
        bird.land();
        Flyable.brake();
        
        // bird.break(); error::
           // Output: The eagle soars using wind currents.
    }
}