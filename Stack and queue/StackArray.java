class stack{
    int size;
    int top;
    int[] arr;

    stack(int size) {

        this.size=size;
        arr= new int[size];
        top=-1;
    }
    public boolean  isFull(){
        return top==size-1;   
    }

    public boolean  isEmpty(){
        return  top==-1;
    }

    public void push(int num){
        if (isFull()){
            System.out.println("Array full");
            
        }
        else{
            arr[++top]=num;
            System.out.println("values added: " +num);
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return  -1;
        }
        else {
            int popItem=arr[top];
            top--;
            return  popItem;
        }
    }
    public  int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return  -1;
        }
        else {
            int popItem=arr[top];
            return  popItem;
        }
    }
    
}




public class StackArray{
    public static void main(String[] args) {
        stack s=new stack(2);
        s.push(2);
        s.push(4);
        s.peek();
        System.out.println(s.isEmpty());
        s.pop();
        System.out.println(s.isFull());
        

    }
}