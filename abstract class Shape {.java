<!DOCTYPE html>
<html lang="en"
<head>
abstract class Shape {
    // Abstract method to calculate area
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[2];

        // Store a Circle and a Rectangle in the array
        shapes[0] = new Circle(5.0);        // Circle with radius 5
        shapes[1] = new Rectangle(4.0, 6.0); // Rectangle with length 4 and width 6

        // Display the areas of the shapes
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}