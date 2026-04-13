import java.util.Scanner;
public class GeometryAndInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  Square
        System.out.print("Enter side of square: ");
        float side = scanner.nextFloat();
        float squareArea = side * side;
        float squarePerimeter = 4 * side;
        // Simple Interest
        System.out.print("Enter Principal: ");
        float p = scanner.nextFloat();
        System.out.print("Enter Rate: ");
        float r = scanner.nextFloat();
        System.out.print("Enter Time: ");
        float t = scanner.nextFloat();
        float si = (p * r * t) / 100;
        // Triangle
        System.out.print("Enter base of triangle: ");
        float base = scanner.nextFloat();
        System.out.print("Enter height of triangle: ");
        float height = scanner.nextFloat();
        float triangleArea = (base * height) / 2;
        //  Cube
        System.out.print("Enter side of cube: ");
        float cubeSide = scanner.nextFloat();
        float cubeVolume = cubeSide * cubeSide * cubeSide;
        // Cuboid
        System.out.print("Enter length of cuboid: ");
        float length = scanner.nextFloat();
        System.out.print("Enter breadth of cuboid: ");
        float breadth = scanner.nextFloat();
        System.out.print("Enter height of cuboid: ");
        float heightCuboid = scanner.nextFloat();
        float cuboidVolume = length * breadth * heightCuboid;
        // Output
        System.out.println("\n--- Results ---");
        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);
        System.out.println("Simple Interest: " + si);
        System.out.println("Triangle Area: " + triangleArea);
        System.out.println("Cube Volume: " + cubeVolume);
        System.out.println("Cuboid Volume: " + cuboidVolume);
        scanner.close();
    }
}