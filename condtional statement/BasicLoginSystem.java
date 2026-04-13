import java.util.Scanner;
public class BasicLoginSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter username:");
        String username=scanner.nextLine();
        System.out.print("Enter password: ");
        String password=scanner.nextLine();
        if (!username.equals("nischal12") && !password.equals("12345")){
            System.out.println("Unable to login");
        }
        else if (!username.equals("nischal12")){
            System.out.println("Invalid Username");      
        }
        else if (!password.equals("12345")){
            System.out.println("Invalid password");
        }

        else{
            System.out.println("Login Succesfully");
        }
        scanner.close();
    }
}
