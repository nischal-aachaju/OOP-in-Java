import java.util.Scanner;
public class GradeSyste {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int marks= scanner.nextInt();
    char grade= scanner.nextLine().charAt(0);
    switch (grade) {
        case 'A':
            System.out.println("Congratulation you got grade A");
            switch (marks/10) {
                case 9:
                case 10:
                    System.out.println("Ecxelent performance");
                    break;

                default:
                    System.out.println("Invalid marks");
                    break;
            }
            break;
        default:
            break;
    }
    scanner.close();
    }
}   
