abstract class Shape{
    abstract double perimeter();
    abstract double area();
}

class CircleShape extends Shape {
    double radius;

    public CircleShape(double r){
        this.radius = r;
    }
    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}

class RectangleShape extends Shape{

    public double length,breadth;

    public RectangleShape(double l, double b){
        this.length = l;
        this.breadth = b;
    }

    @Override
    public double perimeter(){
        return 2 * (length + breadth);
    }

    @Override
    public double area(){
        return length * breadth;
    }
}
public class AbstractClassShape {
    public static void main(String[] args){

        Shape r = new RectangleShape(10,20);
        System.out.println("Area of Rectangle: " +  r.area() + "\n");
        System.out.println("Perimeter of Rectangle: " +  r.perimeter() + "\n");

        Shape c = new CircleShape(1);
        System.out.println("Area of Circle: " +  c.area() + "\n");
        System.out.println("Perimeter of Circle: " +  c.perimeter() + "\n");

    }
}
