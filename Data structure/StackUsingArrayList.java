import java.util.ArrayList;

public class StackUsingArrayList {
    ArrayList<Integer> list = new ArrayList<>();

    public void push(int value){
        list.add(value);
    }
    public int pop(){
        return list.remove(list.size()-1);
    }
    public int peek(){
        return list.get(list.size()-1);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

}
class MainStackMethodArrayList{
    public static void main(String[] args) {
        StackUsingArrayList stl=new StackUsingArrayList();
        stl.push(2);
        System.out.println("Is empty:"+stl.isEmpty());
        System.out.println(stl.peek());
        stl.pop();
        System.out.println("Is empty:"+stl.isEmpty());
        
    }
}