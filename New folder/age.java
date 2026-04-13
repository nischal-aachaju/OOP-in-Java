import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=scanner.nextInt();
        // int age=18;
        String output=(age>=18)?"You can vote":"you can't vote";
        System.out.println(output);
        scanner.close();
    }
}
