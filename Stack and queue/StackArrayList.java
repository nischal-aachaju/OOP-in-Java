
import java.util.ArrayList;

class stackList{
    ArrayList<Integer> list=new ArrayList<>();

    public boolean  isEmpty(){
        return list.isEmpty();
    }
    public void push(int value){
        list.add(value);
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Array is empty");
            return  -1;
            
        }
        else{

            int val=list.remove(list.size()-1);
            System.out.println("value :"+val+" is pop");
            return  val;
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
        }
        else{
            int val=list.get(list.size()-1);
            System.out.println("The value is "+val);
        }
    }

}



public class StackArrayList {
    public static void main(String[] args) {
        stackList s=new stackList();
        // System.out.println(s.isEmpty());
        s.push(-1);
        // s.peek();
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.peek();
        // System.out.println(s.isEmpty());
        
    }
    
}
