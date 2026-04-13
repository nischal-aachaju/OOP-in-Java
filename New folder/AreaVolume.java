import java.util.Scanner;
public class AreaVolume {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1: Area to Triangle \n2: Volume of Cube \n3: Volume of Cuboid \nChooise:");
        int chooise=scanner.nextInt();
        switch (chooise) {
            case 1:
                System.out.println("Area of Triangle");
                System.out.print("Enter Base:");
                float base=scanner.nextFloat();
                System.out.print("Enter Height:");
                float height=scanner.nextFloat();
                float area=(base*height)/2;
                System.out.println("Area:"+area);
                break;
            case 2:
                System.out.println("Volume of Cube");
                System.out.print("Enter side:");
                float side=scanner.nextFloat();
                float volume_cube=side*side*side;
                System.out.println("Volume:"+volume_cube);

                break;
            case 3:
                System.out.println("Volume of Cuboid");
                System.out.print("Enter Length:");
                float Length=scanner.nextFloat();
                System.out.print("Enter Width:");
                float Width=scanner.nextFloat();
                System.out.print("Enter Height:");
                float Height=scanner.nextFloat();
                float volume_cuboid=Length*Width*Height;
                System.out.println("Volume:"+volume_cuboid);
                break;
            default:
                System.out.println("Invalid Chooise");
                break;
            }
            scanner.close();

    }
}
