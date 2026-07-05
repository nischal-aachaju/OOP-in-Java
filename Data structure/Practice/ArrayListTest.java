import java.util.ArrayList;
class a{
    // System.out.println("Hello");
    // int x=10;
    void hello(){
        System.out.println("heello@!1");
    }
    
}

public class ArrayListTest{
    public static void main(String[] args) {
        ArrayList <a> arr=new ArrayList<>();

        a a1=new a();
        a a3=new a();
        a a2=new a();
        a a4=new a();
        a a5=new a();

        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        arr.add(a4);
        arr.add(a5);

        for (a e: arr){
            e.hello();
        }
    }
}