/*
public class NomedaClasse{
    int x = 7;
    public static void main(Stings[] args){
        // Criação de um obejto
        // nome da classe nomedoObjeto = new nome da classe();

        NomedaClasse objetoNome = new NomedaClasse();
        System.out.println(objetoNome.x);
    }
}
 */
// Classes / Objetos


/*public class Main {
    // Atributos
    // Accessing Attributes
    // You can access attributes by creating an object of the class, and by using the dot syntax
    // The attributtes are writed here, and called at the objects by a dot and its name
    int atributo = 45;

    public static void main(String[] args){
        Main objeto = new Main();
        System.out.println(objeto.atributo);
    }
}
//////////////////////////////////////=============================================/////////////////////////////////////

public class Main {
    // Modify Attributes
    int atributo;
    int segAtributo = 18;

    // If you don't want the ability to override existing values, declare the attribute as final:
    final float naomodifica = 3.14159265358979323846f; // If I put below I'll receive an error -> cannot assign a value to a final variable



    // Multiple Objects
    // If you create multiple objects of one class, you can change the attribute values in one object,
    // without affecting the attribute values in the other:
    int multiplo = 84;



    // Multiple Attributes
    // You can specify as many attributes as you want:
    String pNome = "Jeraldin";
    String uNome = "do 888";
    int idade = 38;

    public static void main(String[] args) {
        Main objeto = new Main();
        objeto.atributo = 40;
        objeto.segAtributo = 19;
        System.out.println(objeto.atributo);
        System.out.println(objeto.segAtributo);

        System.out.println();
        // Multiple Objects
        Main multObj = new Main();
        Main multObj2 = new Main();
        multObj.multiplo = 48;
        multObj2.multiplo = 84 + 48;
        System.out.println(multObj.multiplo);
        System.out.println(multObj2.multiplo);

        System.out.println();
        // Multiple Attributes
        Main nomeCompleto = new Main();
        System.out.println("Nome: " + nomeCompleto.pNome + " " + nomeCompleto.uNome);
        System.out.println("idade: " + nomeCompleto.idade);


    }
}
*/
// Atributos


/*
* class Main {
  // Methods
  // Methods are declared within a class
  static void dia(){

    System.out.println("Bom dia!");
    System.out.println();
    System.out.println("I need to put this in the public... args), because it's a method but only it can print this : ()");
  }
  // Static VS Public
  // "Static method" means that I can create and use without an Object, unlike Public, with it I need to call it only with Objects
  static void statico(){
      System.out.println("Static Mehod, I can access without Objects");
     System.out.println();
    }
  public static void publico(){
    System.out.println("I only can access, Public with an Object");
    System.out.println();
  }
  public static void main(String[] args) {

    dia();
     System.out.println();
    statico();
    Main publiObj = new Main();
    publiObj.publico();
    System.out.println();
  }

}
////////////////////////===========================///////////////////////////=================////////////////////

* class Main {
  public void fullThrottle(){
     System.out.println("The car is going as fast as it can!");
  }
  public void speed(int maxSpeed){
     System.out.println("Max speed is: " + maxSpeed);
  }
  public static void main(String[] args) {
    Main myCar = new Main();
    myCar.fullThrottle();
    myCar.speed(298);
  }
}
*/
// Metodos


/*resume
    "Class" is like a factory and each factory has her own thing, and the factory needs something to do, so the "Attributes"
    are the "Carcaça", is like the "Skin", the car's name, color, height, width... attributes are the features than
    defines a class. But a car needs more and have the "Methods", this is the actions how each thing will comport by
    itself, so you can make a class to the throttle and the car will get fast, a brake, to get slow the car and a clutch
    to pass the shift, and can put an if-else inside with a condition, can pass only if the throttle is off and if the
    foot is on the clutch...
    Until here: "Attributes" are who defines a class and "Methods" are the tasks.
    And of course have the "Object", object is a "Ospedeiro", host, I make every thing and with it, I can create a lot
    of cars, these cars are equal but only with "Objects" I can make more cars with each actions
*/
// resumo


/*public class Main {
    int x; // class attribute

    public Main(){ // class constructor for the Main class
        x = 5; // set the initial value for the class attribute x
    }
    public static void main(String[] args) {

        Main construtor = new Main(); // create an object of class Main (this will call the constructor)
        System.out.println(construtor.x);

    }
    // Note that the constructor name must match the class name, and it cannot have a return type (like void).
    //
    //Also note that the constructor is called when the object is created.
    //
    //All classes have constructors by default:
    // if you do not create a class constructor yourself, Java creates one for you.
    //
    // However, then you are not able to set initial values for object attributes.
}
//////////////////////////////==============================/////////////////////////================///////////////

public class Main{
    int modelYear;
    String modelName;
    public Main(int year, String name){
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args){
        Main myCar = new Main(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);

    }
    // Constructor Parameters
    //Constructors can also take parameters, which is used to initialize attributes.
}
*/
// Construtores


/*public class Main{
    // Encapsulation
    //The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
    //
    //declare class variables/attributes as private
    //provide public get and set methods to access and update the value of a private variable

    // Get and Set
    // The get method returns the variable value, and the set method sets the value.

    private String name;

    // Getter
    public String getName(){
        return name;
    }
    // Setter
    public void setName(String newName){
        this.name = newName;
    }
    // Example explained
    //The get method returns the value of the variable name.
    //
    //The set method takes a parameter (newName) and assigns it to the name variable.
    // The "this" keyword is used to refer to the current object.
    //
    //However, as the name variable is declared as private, we cannot access it from outside this class:
    public static void main(String[] args){


    }
}*/
// Encapsulação


/*import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
    // https://www.w3schools.com/java/java_packages.asp
}*/
// Packages / API


/*public class Main{
    // Java Inheritance (Subclass and Superclass)
    //In Java, it is possible to inherit attributes and methods from one class to another.
    //
    //subclass (child) - the class that inherits from another class
    //superclass (parent) - the class being inherited from

    protected String brand = "Ford"; // attribute
    public void honk(){ // method
        System.out.println("Tuut, tuut!");
    }
class Car extends Main{
    private String modelName = "Mustang"; // attribute
    public static void main(String[] args){
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);

    }
}} // isn't working*/
// Inheritance / Herança


/*class Animal {
  public void animalSound(){
    System.out.println("The animal makes a sound");
  }
class Pig extends Animal{
  public void animalSound(){
    System.out.println("The pig says: o o gas");
  }
}
class Dog extends Animal{

    public void animalSound(){
      System.out.println("The dog says: Au au");
    }
}
}
class Main{
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  } // still it doesn't work
}*/
// Polymorphism


/*class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    System.out.println(myInner.y);
  }
  // https://www.w3schools.com/java/java_inner_classes.asp
}*/
// Inner-Class



/*Why And When To Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.
// Abstract you can create a class and methods but you can't use in the been created class, the methods can be used
// by others classes*/
// Abstraction


/*import java.util.Scanner; // Import the Scanner class
public class Main{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        System.out.println("Hello word, enter your name, age and Pi");
        String username = myObj.nextLine(); // Read user input

        // The Scanner class is used to get user input, and it is found in the java.util package.
        //
        //To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.

        int age = myObj.nextInt();
        double pi = myObj.nextDouble();
        System.out.println("username is: " + username);
        System.out.println("You are: " + age);
        System.out.println("you know Pi until: " + pi);
    }

    // Input Types
    // nextBoolean()	Reads a boolean value from the user
    // nextByte()	Reads a byte value from the user
    // nextDouble()	Reads a double value from the user
    // nextFloat()	Reads a float value from the user
    // nextInt()	Reads a int value from the user
    // nextLine()	Reads a String value from the user
    // nextLong()	Reads a long value from the user
    // nextShort()	Reads a short value from the user
}*/
// Java Inputs


/*import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
//LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
//LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
//DateTimeFormatter	Formatter for displaying and parsing date-time objects
public class Main{
    public static void main(String[] args){
        // Display Current Date
        //  display the current date, import the java.time.LocalDate class, and use its now() method
        LocalDate myLocalDate = LocalDate.now();
        System.out.println(myLocalDate);


        // Display Current Time
        // To display the current time (hour, minute, second, and nanoseconds), import the java.time.LocalTime class, and use its now() method:
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);


        // Display Current Date and Time
        //To display the current date and time, import the java.time.LocalDateTime class, and use its now() method
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);


        // Formatting Date and Time
        // The "T" in the example above is used to separate the date from the time.
        // You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects.
        // The following example will remove both the "T" and nanoseconds from the date-time:
        DateTimeFormatter myFormated = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateTime.format(myFormated);
        System.out.println(formattedDate);
        // The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format. For example:
        //
        //Value	Example

        //yyyy-MM-dd	"1988-09-29"
        //dd/MM/yyyy	"29/09/1988"
        //dd-MMM-yyyy	"29-Sep-1988"
        //E, MMM dd yyyy	"Thu, Sep 29 1988"
    }
}*/
// Java Date


/*import java.util.ArrayList; // ArrayList<String> cars = new ArrayList<String>();
public class Main{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        // Add Items
        // The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Honda");
        System.out.println(cars);

        // Access an Item
        // To access an element in the ArrayList, use the get() method and refer to the index number
        System.out.println(cars.get(1));

        // Change an Item
        // To modify an element, use the set() method and refer to the index number
        System.out.println(cars.set(0, "Mazda"));
        System.out.println(cars);

        // Remove an Item
        // To remove an element, use the remove() method and refer to the index number
        cars.remove(0);
        System.out.println(cars);
        // To remove all the elements in the ArrayList, use the clear() method // cars.clear;

        System.out.println();
        // ArrayList Size
        // To find out how many elements an ArrayList have, use the size method
        System.out.println(cars.size());

        System.out.println();
        //Loop Through an ArrayList
        // Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println();
        for(String i: cars){
            System.out.println(i);
        }
    }
}

*/
// ArrayList


/*import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        ArrayList<Integer> myNumbs = new ArrayList<Integer>();
        myNumbs.add(12);
        myNumbs.add(6);
        myNumbs.add(1);
        myNumbs.add(-12);
        myNumbs.add(78);
        myNumbs.add(-78);
        for (int i : myNumbs){
            System.out.println(i);
        }


        // Sort an ArrayList
        // Another useful class in the java.util package is the Collections class,
        // which include the sort() method for sorting lists alphabetically or numerically
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Ford");
        carros.add("Honda");
        carros.add("Opala");
        carros.add("Impala");
        carros.add("F-1000");
        carros.add("Rolls Royce");
        carros.add("Brasília");
        Collections.sort(carros);
        for (String c : carros){
            System.out.println(c);
        }


        System.out.println();
        Collections.sort(myNumbs);
        for (int n : myNumbs){
            System.out.println(n);
        }
    }
}*/
// ArrayList2


/*import java.util.HashMap; // HashMap<String, String> capitalCities = new HashMap<String, String>();
public class Main {
    public static void main(String[] args){
            // Add Items
            //The HashMap class has many useful methods. For example, to add items to it, use the put() method
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Brasil", "Brasília");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);


         // Access an Item
        //To access a value in the HashMap, use the get() method and refer to its key
        System.out.println(capitalCities.get("Brasil"));


//        Remove an Item
//        To remove an item, use the remove() method and refer to the key
        System.out.println(capitalCities.remove("england"));
        System.out.println(capitalCities);
        // To remove all items, use the clear() method:


        // HashMap Size
        //To find out how many items there are, use the size() method
        System.out.println(capitalCities.size());
        for(String b : capitalCities.keySet()){
            System.out.println(b);
        }
        for(String i : capitalCities.values()){
            System.out.println(i);
        }

        System.out.println();
        // Print keys and Values
        for(String n : capitalCities.keySet()){
            System.out.println( n + " " + capitalCities.get(n));
        }


        System.out.println();
        // hashmap with name and age

        HashMap<String, Integer> pessoa = new HashMap<String, Integer>();
        pessoa.put("João", 19);
        pessoa.put("Ursinha", 35);
        pessoa.put("Ursinho", 98);
        for(String x : pessoa.keySet()){
            System.out.println(x + " " + pessoa.get(x));
     }
  }

}*/
// HashMap


/*import java.util.HashSet;
public class Main {
    public static void main(String[] args){
        // Java HashSet
        // A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
        HashSet<String> cars = new HashSet<String>();
        // Add Items
        //The HashSet class has many useful methods. For example, to add items to it, use the add() method
        cars.add("Volvo");
        cars.add("BMW"); // this won't be printed
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        // Check If an Item Exists
        //To check whether an item exists in a HashSet, use the contains() method
        System.out.println(cars.contains("Mazda"));

        // Remove an Item
        //To remove an item, use the remove() method
        cars.remove("BMW"); // clear();

        // HashSet Size
        //To find out how many items there are, use the size method
        System.out.println(cars.size());

        // Loop Through a HashSet
        //Loop through the items of an HashSet with a for-each loop:
        for(String i : cars){
            System.out.println(i);
        }
    }
}
import java.util.HashSet;
public class Main {
    public static void main(String[] args){
        HashSet<Integer> numbs = new HashSet<Integer>();
        numbs.add(4);
        numbs.add(12);
        numbs.add(9);
        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 12; i++) {
            if(numbs.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " wasn't found in the set.");
            }
        }
    }
}
*/
// HashSet


/*import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");

        }
        // Example Explained
        //In this example, The word "w3schools" is being searched for in a sentence.
        //
        //First, the pattern is created using the Pattern.compile() method.
        // The first parameter indicates which pattern is being searched for and the second parameter has a flag to
        // indicates that the search should be case-insensitive. The second parameter is optional.
        //
        //The matcher() method is used to search for the pattern in a string.
        // It returns a Matcher object which contains information about the search that was performed.
        //
        //The find() method returns true if the pattern was found in the string and false if it was not found.
        // https://www.w3schools.com/java/java_regex.asp
    }
}*/
// RegEx

