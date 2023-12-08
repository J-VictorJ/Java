import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*

Java Classes/Objects:
1. Create a simple Java class called "Person" with attributes like name, age, and address. Instantiate a few "Person" objects and display their information.
*/
        class Person {
            String name;
            int age;
            String address;

            Person(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }
        }
        /*Person Pessoa = new Person();
        Pessoa.name = "Chat Gpt";
        Pessoa.age = 1;
        Pessoa.address = "'Internet'";
        System.out.println("Hi, " + Pessoa.name + ", I saw that you're " + Pessoa.age + ". And looks like your home is " + Pessoa.address);*/
//Java Constructors:
// 2. Add constructors to the "Person" class from the previous exercise to initialize its attributes during object creation.

        Person Pessoa2 = new Person("Bicho-Pau", 8, "Brasilia");
        System.out.println(Pessoa2.name + " " + Pessoa2.age + " " + Pessoa2.address);
// Java Inheritance:
// 3. Create a class hierarchy with a base class "Vehicle" and two subclasses "Car" and "Motorcycle." Include attributes like make, model, and year in the base class and add unique attributes to the subclasses. Demonstrate inheritance by creating objects of each class.

        class Vehicle {
            String make;
            String model;
            int year;

            Vehicle(String make, String model, int year) {
                this.make = make;
                this.model = model;
                this.year = year;
            }

            static void StartEngine(String model) {
                model = model;
                System.out.println(model + " started its engines");
            }
        }
        class Car extends Vehicle {
            String color;

            Car(String make, String model, int year, String color) {
                super(make, model, year);
                this.color = color;
            }

            static void StartEngine(String model) {
                model = model;
                System.out.println(model + " started its engines");
            }
        }
        class Motorcycle extends Vehicle {
            int speed;

            Motorcycle(String make, String model, int year, int speed) {
                super(make, model, year);
                this.speed = speed;
            }

            static void StartEngine(String model) {
                model = model;
                System.out.println(model + " started its engines");
            }
        }

        Car Mustang = new Car("Ford Motors", "Mustang", 2020, "Black");
        Motorcycle R1 = new Motorcycle("Yamaha", "R1", 2008, 300);
        System.out.println("Make: " + Mustang.make + ", Model: " + Mustang.model + ", year: " + Mustang.year + ", Color: " + Mustang.color);
        System.out.println("Make: " + R1.make + ", Model: " + R1.model + ", year: " + R1.year + ", Top Speed; " + R1.speed + " km/h");
// Java Polymorphism:
// 4. Define a method in the "Vehicle" class called "startEngine." Override this method in the "Car" and "Motorcycle" subclasses to provide different implementations. Call the "startEngine" method on objects of both subclasses.

        R1.StartEngine("R1");
        Mustang.StartEngine("Mustang");

// Java Abstraction:
// 5. Create an abstract class called "Shape" with an abstract method "calculateArea." Create concrete subclasses like "Circle" and "Rectangle" that extend "Shape" and implement the "calculateArea" method to compute the area of their respective shapes.

        interface Drawable {
            public void draw();
        }
        abstract class Shape implements Drawable {
            abstract float calculateArea(float x, float y);
        }

        class Circle extends Shape implements Drawable {
            @Override
            float calculateArea(float r, float x) {
                return x * (r) * (r);
            }

            public void draw() {
                System.out.println("It's drawable");

            }
        }
        class Rectangle extends Shape {
            @Override
            float calculateArea(float b, float h) {
                return b * h;
            }

            public void draw() {
                System.out.println("One more drawable");
            }

        }
        Circle circle = new Circle();
        System.out.println(circle.calculateArea(15, 3.1415F));
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.calculateArea(15, 18));

//Java Interface:
// 6. Define an interface called "Drawable" with a method "draw" that takes no arguments. Implement this interface in classes like "Circle" and "Rectangle" from the previous exercise and provide their own "draw" implementations.
        circle.draw();
        rectangle.draw();
// Java ArrayList:
// 7. Create an ArrayList of integers and populate it with some values. Perform basic operations like adding, removing, and iterating through the elements.
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(10);
        integers.add(30);
        integers.add(78);
        integers.add(32);
        integers.add(965);
        integers.remove(1);
        for (int i : integers) {
            System.out.println(i);
        }
// Java HashMap:
// 8. Create a HashMap to store the contact information of friends, where the keys are names, and the values are phone numbers. Add, remove, and retrieve entries from the HashMap.

        HashMap<String, Integer> friendsInfo = new HashMap<String, Integer>();
        friendsInfo.put("Manuela", 555782987);
        friendsInfo.put("Isabelle", 4567890);
        friendsInfo.put("Manuel", 242424);
        friendsInfo.remove("Manuel");
        friendsInfo.get("Maunela");
        for (String j : friendsInfo.keySet()) {
            System.out.println("key: " + j + ", value: " + friendsInfo.get(j));
        }
// Java Exception Handling:
// 9. Write a program that reads an integer from the user. Handle any exceptions that may occur when parsing the input.


                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter an integer:");
                try {
                    int userInput = scanner.nextInt();
                    System.out.println("You entered: " + userInput);
                } catch (Exception ex) {
                    System.out.println("Invalid input. Please enter an integer.");
                } finally {
                    scanner.close();
                }


// Java User Input:
// 10. Create a simple command-line program that asks the user for their name and age and then displays a greeting message with their information.

        System.out.println("What's your name?");
        Scanner s = new Scanner(System.in);
        String y = s.next();
        System.out.println("Hi, " + y + ", nice to meet you!");


    }
}