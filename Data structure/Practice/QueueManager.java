public class QueueManager {
    int rear;
    int front;
    int arr[];
    int size;

    public QueueManager(int size) {
        this.size =size;
        arr=new int[size];
        rear=-1;
        front=0;
    }
    public boolean isEmpty(){
        return  rear<front;
    }

    public boolean  isFull(){
        return rear==arr.length-1;
    }
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Arrai is full");
            return;
        }
        arr[++rear]=value;
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Array is empty");
            return -1;
        }
        int value=arr[front];
        front++;
        return  value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Arrai is empty");
            return -1;
        }
        return  arr[front];
    }

    public void displayQueue(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }

public static void main(String[] args) {
    QueueManager q=new QueueManager(5);
    q.enqueue(2);
    q.enqueue(5);
    q.enqueue(40);
    q.enqueue(20);
    q.enqueue(50);
System.out.println(q.dequeue());
System.out.println(q.peek());
    q.displayQueue();
}


}
