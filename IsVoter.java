import java.util.Scanner;

public class IsVoter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter name:");
        String name=scanner.nextLine();
        System.out.print("Enter age:");
        int age=scanner.nextInt(); 
        String voter=(age>=18)?"Hello "+name+", you can vote.":"Hello"+name+",you can't vote.";
        System.out.println(voter);
        scanner.close();
    }

}
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.print("Enter name:");
//         String name=scanner.nextLine();
//         System.out.print("Enter age:");
//         int age=scanner.nextInt();
//         if (age>=18){
//             System.out.printf("Hello %s, you can vote.",name);
//         }
//         else{
//             System.out.printf("Hello %s, you can't vote.",name);
//         }

//         scanner.close();
//     }