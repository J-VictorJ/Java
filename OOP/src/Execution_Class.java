import java.util.Scanner;
public class Execution_Class {

}
//Java Classes/Objects:
//1. Create a simple Java class called "Person" with attributes like name, age, and address. Instantiate a few "Person" objects and display their information.
class Person{
    String name;
    int age;
    String address;

    // #2
    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
// Java Constructors:
// 2. Add constructors to the "Person" class from the previous exercise to initialize its attributes during object creation.

// Java Inheritance:
// 3. Create a class hierarchy with a base class "Vehicle" and two subclasses "Car" and "Motorcycle."
// Include attributes like make, model, and year in the base class and add unique attributes to the subclasses.
// Demonstrate inheritance by creating objects of each class.
class Vehicle{
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // #4
    void StartEngine(String model){
        this.model = model;
        System.out.println(model + " engine is starting");
    }
}
class Car extends Vehicle{
    int seats;
    int horse_power;
    String gearshift;

    Car(String make, String model, int year, int seats, int horse_power, String gearshift){
        super(make, model, year);
        this.seats = seats;
        this.horse_power = horse_power;
        this.gearshift = gearshift;
    }
}
class Motorcycle extends Vehicle{
    int cc;
    Motorcycle(String make, String model, int year, int cc){
        super(make, model, year);
        this.cc = cc;
    }
}
// Java Polymorphism:
// 4. Define a method in the "Vehicle" class called "startEngine." Override this method in the "Car" and "Motorcycle"
// subclasses to provide different implementations. Call the "startEngine" method on objects of both subclasses.

// Java Abstraction:
// 5. Create an abstract class called "Shape" with an abstract method "calculateArea." Create concrete subclasses like
// "Circle" and "Rectangle" that extend "Shape" and implement the "calculateArea" method to compute the area of their respective shapes.

// #6
interface Drawable {
    void draw();
}

abstract class Shape implements Drawable{
    abstract double calculateArea();
}

class Circle extends Shape implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Desenhando um círculo com raio " + radius);
    }
}

class Rectangle extends Shape implements Drawable {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando um retângulo com comprimento " + length + " e largura " + width);
    }
}
// Java Interface:
// 6. Define an interface called "Drawable" with a method "draw" that takes no arguments. Implement this interface
// in classes like "Circle" and "Rectangle" from the previous exercise and provide their own "draw" implementations.


// Java User Input:
// 10. Create a simple command-line program that asks the user for their name and age and then displays a greeting message with their information.
