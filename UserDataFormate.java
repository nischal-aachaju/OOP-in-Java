import java.util.Scanner;
public class UserDataFormate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter name:");
        String name=scanner.nextLine();
        System.out.print("Enter role number:");
        int rollNumber=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter field of interest:");
        String fieldOfIntrest=scanner.nextLine();

        System.out.printf("Hey, my name is %s and my role number is %d. My field of intrest is %s",name,rollNumber,fieldOfIntrest);
        scanner.close();
        
    }
}
