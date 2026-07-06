class Stack{
    int top;
    int size;
    int [] arr;

    public Stack(int size) {
        this.size=size;
        this.top=-1;
        arr=new int[size];
    }

    public boolean  isEmpty(){
        return  top==-1;
    }

    public boolean  isFull(){
        return  top==size-1;
    }

    public void push (int value){
        if (isFull()){
            System.out.println("The array is full");
            return;
        }
        arr[++top]=value;
        System.out.println("Value added"+ value);
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("The object is not fount");
            return -1;
        }
        int value =arr[top--];
        return  value;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The object is ");
            return  -1;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          

    





  

        
    }
    

}



public class StackCalculator {
    
}
