public class StackUsingArray{
    int size;
    int top;
    int[] arr;

    StackUsingArray(int size){
        this.size=size;
        arr =new int[size];
        top=-1;

    }

    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==size-1;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack overflow");
            
        }
        else{
            ++top;
            arr[top]=value;
            System.out.println("pushed value"+value);
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack empty");
            return -1;
        }
        else{
            int popElement=arr[top--];
            System.out.println("popped value"+popElement);
            return popElement;
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack empty");
            return -1;
        }
        else{
            int peekElement=arr[top];
            System.out.println("peeked value"+peekElement);
            return peekElement;
        }
    }

}

class MainStackMethod {
    public static void main(String[] args) {
    StackUsingArray st=new StackUsingArray(3);
    st.push(2);
    System.out.println("IS empty:"+st.isEmpty());
    st.pop();
    System.out.println("IS empty:"+st.isEmpty());
    System.out.println("IS full:"+st.isFull());
    st.push(30);
    st.peek();
    }

}
    

    


