/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceb4midterm;

/**
 *
 * @author ahmed
 */
abstract class Shape{
    String color;
    boolean filled;
 public Shape()  {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
 abstract double getArea();
 abstract double getPerimiter();
    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }

}
class Circle extends Shape{
double radius;
public Circle(double radius){
    this.radius = radius;
}
public Circle(){
        this.filled=false;
        this.radius=1;
        this.color="black";
}
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
return Math.PI*getRadius()*getRadius();
    }

    @Override
    double getPerimiter() {
return 2*getRadius()*Math.PI;
    }

    
@Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}'
      +"Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    
}
class Rectangle extends Shape{
double width;
double length;

    public Rectangle() {
        this.filled=false;
        this.width=1;
        this.length=1;
        this.color="black";
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    double getArea() {
return getWidth()*getLength();
    }

    @Override
    double getPerimiter() {
return 2*getWidth()+2*getLength();
        }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
}
class Square extends Rectangle{
    double side;
public Square(){
     this.filled=false;
        this.side=1;
        this.color="black";
}
    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
        this.side=side;
    }

  

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void setWidth(double side) {
        this.width = getSide();
    }

    @Override
    public void setLength(double side) {
        this.length = getSide();
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
}
public class ExamExQ2 {
                public static void main(String[] args) {
    Square p = new Square(23,12,2.0,"lime",true);
    System.out.println(p.toString()+p.getArea());
    Circle c = new Circle(2);
        System.out.println(c.toString()+c.getArea()+" "+c.getPerimiter());

                }
}
