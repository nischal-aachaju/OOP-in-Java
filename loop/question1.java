import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int i;
        do{
        System.out.print("Enter number:");
        i=scanner.nextInt();
        }while(i!=0);
        scanner.close();
    }
}
