abstract class Polygon{
String shapeName;

    public Polygon(String name) {this.shapeName=name;
    }

    abstract double calculatePerimeter();
}

class Triangle extends  Polygon{
double side1,side2,side3;

    public Triangle(String name,double side1,double side2,double side3) {
        super(name);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;

    }

    @Override
    double calculatePerimeter(){
        return (this.side1+this.side2+this.side3);
    }

}

class Squares extends Polygon{
double side;
    public Squares(double side,String name){
        super(name);
        this.side=side;
    }
    @Override
    double calculatePerimeter(){
        return 4* side;
    }

}
class Rectangle extends  Polygon{
    double length,width;

    public Rectangle(String name,double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    
    @Override
    double calculatePerimeter(){
        return  2*(this.length+this.width);
    }
}

public class ShapeMain {
  public static void main(String[] args) {
    Triangle t=new Triangle("tra",  20, 30, 50);
    Squares s=new Squares(4,"sqr");
    Rectangle r=new Rectangle("rec",    2, 4);
System.out.println(   " "+ t.calculatePerimeter()+
    s.calculatePerimeter()+
    r.calculatePerimeter());

  }  
}
