import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        float PrincipleAmount=scanner.nextFloat();
        System.out.print("Enter Rate: ");
        float Rate=scanner.nextFloat();
        System.out.print("Enter Time in year: ");
        float Time=scanner.nextFloat();
        float SI=(PrincipleAmount*Time*Rate)/100;
        System.out.println("Simple intrest:"+SI);
        scanner.close();
    }
}
