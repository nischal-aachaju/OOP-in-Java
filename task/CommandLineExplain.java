public class CommandLineExplain {
    public static void main(String[] args){
        String fname=args[0];
        String lname=args[1];
        int age=Integer.parseInt(args[2]);
        System.out.println(fname+" "+lname+" Age: "+age);
    }
}
