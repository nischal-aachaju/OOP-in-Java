import java.util.Scanner;
public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks of 4 subjects out of 100");
        float m1=scanner.nextFloat();
        float m2=scanner.nextFloat();
        float m3=scanner.nextFloat();
        float m4=scanner.nextFloat();
        float total=m1+m2+m3+m4;
        float percentage=total/4;
        if (percentage>=70){
            System.out.println("First Class and total:"+total+" percentage:"+percentage);
        }
        else if (percentage>59){
            System.out.println("Upper Second Class and total:"+total+" percentage:"+percentage);
        }
        else if (percentage>49){
            System.out.println("Second Class and total:"+total+" percentage:"+percentage);
        }
        else if (percentage>39){
            System.out.println("Third Class and total:"+total+" percentage:"+percentage);
        }
        else if (percentage<40){
            System.out.println("Fail");
        }
        else{
            System.out.println("Somewant wrong");
        }
        scanner.close();
    }
}
