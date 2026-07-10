// public class Queue { 
//     int size; 
//     int rear;
//     int front;
//     int[]arr;
//     Queue(int size){
//         this.size=size;
//         arr=new int[size];
//         rear=-1;
//         front=0;
//     }
//     public boolean isEmpty(){
//                 return rear<front;
//         }
//         public boolean  isFull(){

//                 return rear==size-1;

//         }

//         public void enqueue(int value){
//             if (isFull()){
//                 System.out.println("The queue is empty");

//             }
//             else{
//                 arr[++rear]=value;
//                 System.out.println("value added:" +value);
//             }
//         }
//         public int dequeue(){
//             if (isEmpty()){
//                 System.out.println("The queue is full");
//                 return -1;
//             }
//             else{
//                 int value=arr[front++];
//                 return  value;
//             }
//         }

//         public int peek(){
//             if (isEmpty()){
//                 isEmpty();
//                 return -1;
//             }
//             else{
//                 int value=arr[front];
//                 return  value;
//             }
//         }

//   }

// class Main {
//     public static void main(String[] args) {
//         Queue q=new Queue(2);
//         q.isEmpty();
//         q.enqueue(12);
//         q.isEmpty();
//         q.enqueue(14);
//         q.isFull();
//         System.out.println(q.peek());
//         q.dequeue();
//         System.out.println(q.peek());
//     }
// }
