import java.util.ArrayList;
import java.util.Scanner;
public class Array{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter array length: ");
    int odd_counter=0; 
    int even_counter=0;
    int num;
    int arr_lnth=sc.nextInt();
    int [] arr=new int[arr_lnth];
    
    for(int i=0;i< arr.length;i++){
    System.out.print("Enter number: ");
    num=sc.nextInt();
        if (num%2==0){
            even_counter++;
        }
        else{
            odd_counter++;
        }
        arr[i]=num; 
    }
    sc.close();
    System.out.println("Odd count:"+odd_counter);
    System.out.println("Even count:"+even_counter);
    int sum=0;
    for (int j=0;j<arr.length;j++){
        sum+=arr[j];
    }
    System.out.println("Sum: "+sum);
    ArrayList<Integer> age=new ArrayList<>();
    age.add(1,2);

}
}