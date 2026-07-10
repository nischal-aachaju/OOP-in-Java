import java.util.ArrayList;

class QueueArray {
    ArrayList<Integer> arr = new ArrayList<>();
    int front=0;
    int rear=-1;
    boolean isEmpty(){
       return  rear< front;
    }

    void enqueue(int value){
        rear++;
        arr.add(value);
    }

    int dequeue(){
         if(isEmpty()){
            System.out.println("The queue is Empty");
            return -1;
         }
         return  arr.get(front++);
    }
    int peek(){
        if(isEmpty()){
            System.out.println("The queue is Empty");
            return -1;
         }
        return  arr.get(front++);
    }
}

public class QueueArrayMain{
    public static void main(String[] args) {
        QueueArray q=new QueueArray();
        System.out.println(q.isEmpty());
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
