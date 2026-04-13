import java.util.Scanner;
public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=scanner.nextInt();
        System.out.print("Enter second number:");
        int num2=scanner.nextInt();
        int sum=num1+num2;
        int product =num1*num2;
        System.out.println("Sum is "+sum);
        System.out.println("Product is "+product);
        scanner.close();
        float division=(float)sum/product;
        System.out.println("Division of sum and product is "+division);
    }
}
