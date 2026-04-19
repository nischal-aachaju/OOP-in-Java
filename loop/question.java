import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.print("Enter number:");
            int num =scanner.nextInt();
            if (num>=20 && num <=50){
                System.out.println("valid");
                break;
            }
        }
        scanner.close();
    }
}
