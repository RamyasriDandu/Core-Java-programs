package com.assessment;

abstract class Shape {
	
    abstract void getArea();

    abstract void getPerimeter();
}

class Circle extends Shape {
    static double pi = 3.14;
    float radius;

    public float getRadious() {
        return radius;
    }

 

    public void setRadious(float radious) {
        this.radius = radious;
    }

 

    public Circle(float radious) {
        super();
        this.radius = radious;
    }

 

    public Circle() {
        System.out.println("Default Constructor");
    }

 

    @Override
    void getArea() {

 

        double Area = pi * (radius * radius);
        System.out.println("Area circle is" + Area);
    }

 

    @Override
    void getPerimeter() {

 

        double Perimeter = 2 * (pi * radius);
        System.out.println("Circle perimeter is" + Perimeter);
    }
}

 

class Square extends Shape {
    float side;

 

    public float getSide() {
        return side;
    }

 

    public void setSide(float side) {
        this.side = side;
    }

 

    public Square(float side) {
        super();
        this.side = side;
    }

 

    public Square() {
        System.out.println("Default constructor");
    }

 

    @Override
    void getArea() {
        float Area = side * side;
        System.out.println("Square Area is" + Area);
    }

 

    @Override
    void getPerimeter() {
        float Perimeter = 4 * side;
        System.out.println("Square perimeter" + Perimeter);
    }

 

}

 

class Rectangle extends Shape {
    float length;
    float breadth;

 

    public Rectangle(float length, float breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }

 

    public float getLength() {
        return length;
    }

 

    public void setLength(float length) {
        this.length = length;
    }

 

    public float getBreadth() {
        return breadth;
    }

 

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

 

    public Rectangle() {
        System.out.println("Default Constructure");
    }

 

    @Override
    void getArea() {
        float Area = length * breadth;
        System.out.println("Area of rectangle is" + Area);
    }

 

    @Override
    void getPerimeter() {
        float perimeter = 2 * (length + breadth);
        System.out.println(perimeter);
    }

 

}

 

public class Test {
    public static void main(String[] args) {


        Circle c = new Circle();
        // Circle c1 = new Circle(5);
        c.setRadious(3);
        c.getArea();
        c.getPerimeter();
        Square s = new Square(3);
        s.getArea();
        s.getPerimeter();
        Rectangle r = new Rectangle(6, 7);
        Rectangle r1 = new Rectangle();
        r.getArea();
        r.getPerimeter();
    }
}
 





