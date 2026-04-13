import java.util.Scanner;
public class Student{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x:");
        int x=scanner.nextInt();
        System.out.print("Enter y:");
        int y=scanner.nextInt();
        System.out.print("Enter z:");
        int z=scanner.nextInt();
        int d=10;
        int e=20;
        int f=30;
        int sum=d+e+f;
        if ((x+y+z)==0){
            System.out.println("Sum cannot be zero");
        }
        else if ((x+y+z)>=sum){
            System.out.printf("The sum(%d) of input is greater then internal sum(%d) \n",x+y+z,sum);
            if (x==y && x==z){
                System.out.println("All are equal");
            }
            else if (x>y){
                if (x>z){
                    System.out.println("X is greater");
                }
                else{
                    System.out.println("z is greater");
                }
            }
            else if (y>z){
                if (y>x){
                    System.out.println("Y is greater");
                }
                else{
                    System.out.println("X is greater");
                }
             }
             else {
                System.out.println("z is greater");
             }
        }
        else{
            System.out.printf("The sum(%d) of input is smaller then internal sum(%d) \n",x+y+z,sum);
        }
        scanner.close();
    }
}