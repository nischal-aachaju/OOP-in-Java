class Shape{
    public void calculateArea(){
        System.out.println("Area");
    }
}

class Circle extends Shape{
    public void calculateCircumference(){
        System.out.println("Circumference");
    }
}

class Rectangle extends Shape{
    public void calculatePerimeter(){
        System.out.println("Perimeter");
    }
}

class MainShape{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.calculateArea();
        c1.calculateCircumference();

        Rectangle r1=new Rectangle();
        r1.calculateArea();
        r1.calculatePerimeter();
    }

}