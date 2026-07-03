
class Stack{
    int size;
    int arr[];
    int top;

    Stack(int size) {
        this.size=size;
        arr=new int[size];
        top=-1;
    }

    public boolean  isFull(){
        return  top== size-1;
    }

    public boolean  isEmpty(){
        return  top==-1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack overflow");
        }
        else {
            arr[++top]=value;
            System.out.println("value added:"+value);
        }

    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return  -1;

        }
        else{
            return  arr[top--];
        }
    }

        public int peek(){
            if(isEmpty()){
                System.out.println("stak is empty");
                return  -1;
            }
            else {
                return  arr[top];
            }
        }

}


class calculator{
    int size;
    Stack a;
    calculator(int size) {
        this.size=size;
        a=new Stack(size);
    }

    public void addNumber(int num){
    
        a.push(num);
    }

    public  void add(){
        int num1=a.pop();
        int num2=a.pop();
        int sum=num1+num2;
        a.push(sum);
    }
    public void substract(){
        int num1=a.pop();
        int num2=a.pop();
        int sum=num1-num2;
        a.push(sum);
    }
    public int displayResult(){
        return a.peek();
    }
}




public class StackCalculator {
 public static void main(String[] args) {
    calculator c=new  calculator(5);
    c.addNumber(7);
    c.addNumber(5);
    // c.add();
    c.substract();
    System.out.println(c.displayResult());
 }
}
