/*
public class Main {
    public static void main(String[] args) {
        // Print Text
        // Println
        System.out.println("Hello world!"); // println jump a line
        System.out.println("This is so cool");

        // Print
        // It does not insert a new line at the end of the output
        System.out.print("This is okay   ");
        System.out.print("But this don't jump :()");




        // Numbers
        // Numbs only can run with 'println()
        System.out.println();
        System.out.println(3*9);
        System.out.println(9);
        System.out.println(87 / 3);


        // Coments
        with  //  and  /** /'
    }
}*/
// Print and Coments


/*public class Main {
    public static void main(String[] args){
        // Variables


        Variables are containers for storing data values.

In Java, there are different types of variables, for example:

String -        stores text, such as "Hello". String values are surrounded by double quotes
int -           stores integers (whole numbers), without decimals, such as 123 or -123
float -         stores floating point numbers, with decimals, such as 19.99 or -19.99
char -          stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean -       stores values with two states: true or false




// Declaring Variables
// type variableName = value;
        int x = 98;
                System.out.println(x + 2 );

                String name = "João";
                System.out.println(name);

                int y;
                y = 2; // I can declare later
                System.out.println(x+y);


// Final Var'
final int a = 2;
        // I can't change the value of "a" anymore, is like const of JS

        // Other Var'
        float flo = 9.88f; // I need to put the f
        char oneLetter = 'M';
        boolean boo = true;
        String maisLetras = "Hello, word";

        }
        }*/
// Variables 1


/*public class Main {
    public static void main(String[] args){
        // Display Variables
        // Use "+" to combine
        String nome = "João ";
        System.out.println("Hello, " + nome);

        // Adding two var
        String mName = "Victor";
        String fName = nome + mName;
        System.out.println(fName);
        System.out.println();



        // Declare Many Variables
        // To declare more than one variable of the same type, you can use a comma-separated list:

        int x = 5, y = 9, z = 15;
        System.out.println(x+y+z);

        System.out.println();

        // One Value to Multiple Variables
        int a, b, c;
        a = b = c = 25;
        System.out.println(a+b+c);
    }
}*/
// Variables 2


/*public class Main {
    public static void main(String[] args){

        // Data Types
        // Numbers

        // Byte
        // The byte data type can store whole numbers from -128 to 127.
        byte bait = 126;
        System.out.println(bait);



        // Short
        // The short data type can store whole numbers from -32768 to 32767:
        short chort = 32765;
        System.out.println(chort);


        // Int
        // The int data type can store whole numbers from -2147483648 to 2147483647.



        // Long
        // The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
        // This is used when int is not large enough to store the value. Note that you should end the value with an "L":

        long longo = 922337203685477580L; // with L
        System.out.println(longo);



        // Floating Point
        // Float
        float point1 = 9.154F; // with F
        System.out.println(point1);
        // Float has a precision of 6, 7 decimal digits; Double has about 15, use double at calculations


        double novo = 91.154877852169D; // with D
        System.out.println(novo);

    }
}*/
// Data Types/ Numbers


/*public class Main {
    public static void main(String[] args){
        // Booleans == true or false, on or off...

        // Characters
        // Char
        // The char data type is used to store a single character.
        // The character must be surrounded by single quotes, like 'A' or 'c':

        char sex = 'M';
        System.out.println(sex);

        // String...
        String tex = "Tout des mots";
        System.out.println(tex);
    }
}*/
// Data Types/ Char'


/*public class Main{
    public static void main(String[] args){
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double
        //

        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte

        int numb = 8;
        double nume = numb;
        System.out.println(numb);
        System.out.println(nume);

        // Narrowing
        double larg = 9.5612;
        int little = (int) larg; // is needed
        System.out.println(larg);
        System.out.println(little);

    }
}*/
// Type Casting


/*public class Main{
    public static void main(String[] args){
        // Operators
        int x = 35;
        int y = 15;

        System.out.println(x+y + "   Adição");
        System.out.println(x-y + "   Subtração");
        System.out.println(x*y + "   Multiplicação");
        System.out.println(x/y + "   Divisão");
        System.out.println(x%y + "   Módulo");
        System.out.println(++x + "   Incremento");
        System.out.println(--y + "   Decremento");
        System.out.println();
        System.out.println();

        // Assignment Operators
        // x+=, /=, -=, %= ...


        // Operadores de comparação
        // == Equal to | != not equal | > greater than | < less than |  >= greater than or equal | >= less...
        System.out.println(x > y);


        // Java Logical Operators
        // && and     || or     ! not
    }
}*/
// Operators


/*import java.util.Locale;

public class Main{
    public static void main(String[] args){
        // Strings
        // String Length

        String tex = "Je peux regarder par un plante parce qu'il est de moi";
        System.out.println("the length of the text is: " + tex.length());

        // More Methods
        // toUpperCase and toLowerCase
        System.out.println(tex.toLowerCase());
        System.out.println(tex.toUpperCase());
        System.out.println();


        // Finding a Character in a String
        // The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string
        System.out.println(tex.indexOf("est"));
        System.out.println();





        // Concatenation
        String pNome = "João "; // needed a space here :(
        String uNome = "Victor";
        System.out.println(pNome + uNome);
        // or
        System.out.println(pNome.concat(uNome));
        System.out.println();





        // Strings - Special Characters
        // backslash /'/'      /"/"      //
        String texto = "Preciso colocar aspas duplas \"assim da certo\" :)";
        System.out.println(texto);
        String simples = "Caso  precise de \'aspas simples\' \\ da barra também\\";
        System.out.println(simples);


        // \n	New Line
        // \r	Carriage Return
        // \t	Tab
        // \b	Backspace
        // \f	Form Feed

        System.out.println("Texto sendo \n escrito com \r várias linhas \b apagado e \f não sei o que é :()");
    }
}*/
//Strings/ Caracteres especiais


/*public class Main{
    public static void main(String[] args){
        // Math

        // Math.max()
        System.out.println(Math.max(78, 23));

        // Math.min()
        System.out.println(Math.min(78, 23));

        // Math.sqrt()
        System.out.println(Math.sqrt(64));

        // Math.abs(x)
        // The Math.abs(x) method returns the absolute (positive) value of x:
        System.out.println(Math.abs(-65.563));

        // Math.random()
        int randNum = (int)(Math.random()*100);
        System.out.println(randNum);


    }
}*/
// Math Class


/*public class Main{
    public static void main(String[] args){
        // if; else if; else;

        int x = 5;
        int y = 5;

        if(x > y){
            System.out.println(x + " é maior que " + y);
        }else if(x == y){
            System.out.println(x + " é igual a " + y);
        }else{
            System.out.println("else");
        }



        // Operador Ternário
        // variable = (condition) ? expressionTrue :  expressionFalse;

        String resultado = (x > y) ? x + " é maior que " + y : x + " é igual a " + y;
        System.out.println(resultado);
    }

}*/
// If else / Ternary Op...


/*public class Main{
    public static void main(String[] args){
        // Switch Case

        int dia = 2;

        switch (dia){
           case 1:
                System.out.println("Segunda");
                 break;
           case 2:
                System.out.println("Terça");
                break;
           case 3:
                System.out.println("Quarta");
                break;
            default:
                System.out.println("defalut");
        }

    }
}*/
// Switch Case


/*public class Main{
    public static void main(String[] args){
        // While
        // while (condition){code; control structure;}

        int i = 5;
        while (i > 0){
            System.out.println(i);
            i--;
        }


        // Do While

        int j = 0;

        do {
            System.out.println(j);
            j++;
        }while(j < 5);
    }
}*/
// While / Do While


/*public class Main {
    public static void main(String[] args){
        // For loop
        // for (statement 1; statement 2; statement 3) {code;}

        for(int i = 0; i < 5+1; i++){
            System.out.println(i);
        }


        // For each
        // for (type variableName : arrayName) {code;}

        String[] cars = {"Honda", "Ford", "Nissan-bom"};
        for (String i: cars) {
            System.out.println(i);
        }
    }
}*/
// For loop / For-each


/*public class Main {
    public static void main(String[] args){
        // Arrays
        // To declare an array, define the variable type with square brackets:
        String[] modelosCar = {"f-250", "Civic", "Silverado", "Shelby"};


        // with int
        int[] anos = {2002, 2000, 1964, 1985, 1800};


        // Access elements in an array
        System.out.println(modelosCar[1]);
        System.out.println(anos[0]);


        // Changing elements
        anos[4] = 2022;
        System.out.println(anos[4]);


        // .length
        System.out.println(anos.length);



    }
}*/
// Arrays


/*public class Main {
    public static void main(String[] args){
        // For loop-Arrays
        String[] modelos = {"Civic", "f-250", "Shelby"};

        for(int i = 0; i < modelos.length; i++){
            System.out.println(modelos[i]);
        }

        // For-each
        // for (type variable + declaration: arrayname) {code}

        int[] ano = {2002, 1945, 1964};
        for (int year: ano){
            System.out.println(year);
        }
    }
}*/
// Loop Through arrays


/*class Main {
   // Method
  static void meuMetodo(){
      // código
      System.out.println("I've got just executed!");
      // static means that the method belongs to the Main class and not an object of the Main class.
    // void means that this method does not have a return value.

  }
  public static void main(String[] args) {

    meuMetodo();
    // A method can also be called multiple times:
    meuMetodo();
    meuMetodo();
  }
}*/
// Methods


/*class Main {
  // Parameters and Arguments
  static void nomeCompleto(String pNome){
    System.out.println(pNome + " " + "da Carroça");
  }
  // Multiple Parameters
  static void nomeIdade(String nome, int idade){
    System.out.println(nome + " is " + idade + " years old");
  }

  static int comRetorno(int x){
    return 5 * x;
    // The void keyword, used in the examples above, indicates that the method should not return a value.
    // If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
    // instead of void, and use the return keyword inside the method:
  }
  static int multiplicacao(int a, int b){
    return a * b;
  }
  static void checkAge(int age){
    if (age < 18){
      System.out.println("Access denied - You are not old enough!");
    }
    else{
      System.out.println("Access granted - You are old enough");
    }
  }
  public static void main(String[] args) {
    nomeCompleto("Barnadaré");
    System.out.println();
    nomeIdade("Barnabé da Carroça", 12);
    System.out.println();
    System.out.println(comRetorno(8));
    System.out.println();
    System.out.println(multiplicacao(8, 4));

    // You can also store the result in a variable (recommended, as it is easier to read and maintain):
    int z = multiplicacao(7, 9);
    System.out.println(z);

    checkAge(18);
    checkAge(16);
  }
}*/
// Methods Parameters


/*public class Main{
  static int plusMethod(int x, int y){
    return x * y;
  }
  static double plusMethod(double x, double y){
    return x - y;
  }
  public static void main(String[] args){
    int a = plusMethod(8, 5);
    double b = plusMethod(8.5, 5.7);
    System.out.println("int: " + a);
    System.out.println("double: " + b);
    System.out.println("I can use any types 'line 3 and 6'");
  }
}*/
// Methods Overloading

