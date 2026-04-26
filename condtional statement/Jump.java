import java.util.Scanner;
public class Jump {
    
     static void greed(String name){
        System.out.println("Hello, " + name + "!");
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password="nischal1212";
        
        System.out.print("Enter your name:");
        String name=scanner.nextLine();
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter password:");
            String inputPasword=scanner.nextLine();
            if (password.equals(inputPasword)){
                greed(name);
                System.out.println("Access granted.");
                // System.out.println(greed(name));
                break;
            } 
        }
    }
}