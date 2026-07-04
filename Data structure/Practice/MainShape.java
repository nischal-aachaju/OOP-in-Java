
// abstract class Shape{
// abstract double area();
// abstract  double perimeter();
// void display(){
//     System.out.println("Area: "+area()+" Perimeter: "+perimeter());
// }
// }
// class Triangle extends  Shape{
//     float base;
//     float height;
//     float side1;float side2;
//     float side3;
//     Triangle(float base,float height,float side1,float  side2,float side3){
//     this.base=base;
//     this.height=height;
//     this.side1=side1;
//     this.side2=side2;
//     this.side3=side3;
//     }
//     @Override
//     double area(){
//         return 0.5*this.base*this.height;
//     }
//     @Override
//     double perimeter(){
//         return  this.side1+this.side2+this.side3;
//     }

// }

// class Square extends Shape{
//     float length;

//     public Square(float length) {
//         this.length=length;
//     }

//     @Override
//     double area(){
//     return  this.length*this.length;
//     }

//     @Override
//     double perimeter(){
//         return 4*this.length;
//     }
    
// }

// public class MainShape{
//     public static void main(String [] args){
//         Square s=new Square(5);
//         Triangle t=new Triangle(2, 3, 3, 4, 4);
//         s.display();
//         t.display();
//     }
// }