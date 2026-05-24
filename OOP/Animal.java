public class Animal {
    
    public void eating(String name){
        System.out.println("Name: "+name);
    }
}

class Cat extends Animal{
public void meow(){
    System.out.println("Meow!!!!");
}
}

class  Dog extends Animal{
public void bark(){
    System.out.println("Bark!!!!");
}   
}

class Puppy extends Dog{
    public void cBark(){
        System.out.println("Child Bark !!!");
    }
}

class Main{
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.eating("Miki");
        c1.meow();

        Dog d1=new Dog();
        d1.eating("Sweeti");
        d1.bark();

        Puppy p1=new Puppy();
        p1.eating("Jack");
        p1.bark();
        p1.cBark();

    }
}
