
import java.util.ArrayList;

class stack{

    ArrayList<String> arr=new ArrayList<>();

    boolean isEmpty(){
        return arr.isEmpty();
    }

    void push(String name){
        arr.add(name);
    }

    String pop(){
        return arr.remove(arr.size()-1);
    }

    String peek(){
        return  arr.get(arr.size()-1);
    }

}

public class StudentsName {
    public static void main(String[] args) {
        stack s=new stack();
        s.push("Nischal");
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        s.push("Nirjal");
        System.out.println(s.peek());
        
    }
}
