
import java.util.ArrayList;

public class EmployeeManager{

    ArrayList<Integer> arr=new ArrayList<>();
    boolean isEmpty(){
        return arr.isEmpty();
    }

    public void push(int value){
 
        arr.add(value);
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return  -1;
        }
        return arr.remove(arr.size()-1);
    }
    public int peek(){
        return arr.get(arr.size()-1);
    }
    public void displayStack(){
        for(int e:arr){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        EmployeeManager e=new EmployeeManager();
        e.push(2);
        e.push(3);
        e.push(10);
        e.push(20);
        e.push(40);

        System.out.println(e.pop());
        System.out.println(e.peek());
        e.displayStack();
    }

}


