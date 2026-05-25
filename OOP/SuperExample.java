public class SuperExample {
    String name="Ram";
    String z; 
    
    SuperExample(String z){
        this.z=z;
        System.out.println("This is the super class constructor");
    }
    void eat(){
        System.out.println("super example : eating :");
    }
}

class SuperEx extends SuperExample{
    String name="Hari";

   SuperEx(String z){
     super(z);
     System.out.println("this is thee class constructor");
     
   }
    void eat(){
        System.out.println("super ex : eating :");
    }
    
    void displayName(){
        System.out.println(super.name);
        System.out.println(name);
        super.eat();
        eat();
    }
}

class SuperMain {
    public static void main(String[] args) {
        
        SuperEx sx =new SuperEx("Hello");
        sx.displayName();

}
}