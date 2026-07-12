class Shape{
    public void calculateArea(){
        System.out.println("Area of shape");
    }
}

class Circle extends Shape{
    public void calculateCircumference(){
        System.out.println("Circumference of Circle");
    }
}

class Rectangle extends Shape{
    public void calculatePerimeter(){
        System.out.println("Perimeter of Rectangle");
    }
}

class Square extends Shape{
    public void calculatePerimeter(){
        System.out.println("Perimiter of square");
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

        Square s1=new Square();
        s1.calculateArea();
        s1.calculatePerimeter();
    }

}