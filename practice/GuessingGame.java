import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {
        int number=(int)(Math.random()*100);
        System.out.println(number);
        int ans=numberGueser(number);
        if (ans==-1){
            System.out.println("Byee");
        }
        else{
            System.out.printf("You guess it. The number is %d",ans);
        }
    }
    public static int Counter(int i) {
        
        return ++i;
    }
    public static int numberGueser(int number) {
        int numGuess;
        Scanner scanner=new Scanner(System.in);
        int i=0;
        while (true) {
            
            System.out.print("Enter number between 0 to 100:");
            numGuess=scanner.nextInt();
            if (number==numGuess){
                scanner.close();
                return number;
            }
            else if (numGuess<0){
                scanner.close();
                return -1;
            }
            else{
                
                int counter=Counter(i);
                System.out.println("Try:"+counter);
                i=counter;
            }
        } 
    }
}
