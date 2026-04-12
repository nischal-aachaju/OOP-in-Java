import java.util.Scanner;

public class SwitchCase {
        public void time_day (int time){

                switch (time) {
                    case 0:
                        System.out.println("Day");
                        break;
                    case 1:
                        System.out.println("Night");
                        break;
                    default:
                        System.out.println("Invalid");
                        break;
                }   
        }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
SwitchCase sc = new SwitchCase();
        int day=Integer.parseInt(args[0]);
        switch (day) {
            case 1:
                System.out.print("Enter (0/1) day/neight:");
                int time1=scanner.nextInt();
                sc.time_day(time1);
                System.out.println("Sunday");
                break;
            case 2:
                System.out.print("Enter (0/1) day/neight:");
                int  time2=scanner.nextInt();
                sc.time_day(time2);
                System.out.println("Monday");

                break;
            case 3:
                System.out.print("Enter (0/1) day/neight:");
                int  time3=scanner.nextInt();
                sc.time_day(time3);
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.print("Enter (0/1) day/neight:");
                int  time4=scanner.nextInt();
                sc.time_day(time4);
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.print("Enter (0/1) day/neight:");
                int  time5=scanner.nextInt();
                sc.time_day(time5);
                System.out.println("Thursday");
                break;
            case 6:
                System.out.print("Enter (0/1) day/neight:");
                int  time6=scanner.nextInt();
                sc.time_day(time6);
                System.out.println("Friday");
                break;
            
            case 7:
                System.out.print("Enter (0/1) day/neight:");
                int  time7=scanner.nextInt();
                sc.time_day(time7);
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid days");
                break;
        }
        scanner.close();
    }
}
