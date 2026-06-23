public class QueueUsingArray{
    int size;
    int rear;
    int front;
    int [] arr;

    QueueUsingArray(int size) {
        this.size=size;
        rear=-1;
        front=0;
        arr=new int[size];
    }
    public boolean isEmpty(){
        return rear< front;
    }

    public boolean isFull(){
        return rear==size-1;
    }

    public void enqueue( int value){
        if (isFull()){
            System.out.println("Is full");
            return;
        }
        arr[++rear]=value;
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("is Empty");
            return -1;
        }
        int dequeueElem=arr[front++];
        return dequeueElem;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("is Empty");
            return -1;
        }
        int Elem=arr[front];
        return Elem;
    }

}

class MainQueueArray{
    public static void main(String[] args) {
        QueueUsingArray qa=new QueueUsingArray(3);
        System.out.println(qa.isEmpty());
        System.out.println(qa.isFull());
        qa.enqueue(18);

        System.out.println( "the value is "+qa.peek());
        qa.dequeue();
        System.out.println( "the value is "+qa.peek());
        int val=qa.peek();
        if (val==-1){
            System.out.println("the arr is empty");
        }
        else {
            System.out.println("The value is "+ val);
        }
    }
}