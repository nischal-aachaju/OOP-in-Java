public class Species {
    public static void main(String[] args) {
        Animal dog = new Animal();
         Animal cat = new Animal();
        Animal cow = new Animal();
        dog.eat("dog");
        cat.sleep("cat");
        cow.run("cow");
    }
}

class Animal 

    void eat(String name) {
        System.out.println("Eating " + name + "..");
    }
    void sleep(String name) {
        System.out.println("Sleeping " + name + "..");
    }
    void run(String name) {
        System.out.println("Running " + name + "..");
    }
}