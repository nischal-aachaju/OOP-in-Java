import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Length:");
        float length=scanner.nextFloat();
        System.out.print("Enter breadth:");
        float breadth= scanner.nextFloat();
        int area= (int)(length*breadth);
        System.out.println("Area of Rectriangle:"+area);

        scanner.close();
    }
}
