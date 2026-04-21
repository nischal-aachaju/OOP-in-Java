public class Methods {
    public static int HelloPrint() {
        System.out.println("Hello world from HelloPrint");
        return 2;
    }
    public static String PrintName(String name) {
        return "Hello, "+name;
    }
    public static int Sum(int a,int b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Hello world from main");
        //method call
        HelloPrint();
        HelloPrint();
        HelloPrint();
        System.out.println(HelloPrint() );
        System.out.println(PrintName("Nischal"));
        System.out.println(Sum(20, 30));
    }
}
