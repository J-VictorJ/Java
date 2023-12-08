import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // #1
        /*Person fulano = new Person();
        fulano.name = "Fulano";
        fulano.age = 30;
        fulano.address = "Rua dos bobos nº 0";
        System.out.println(fulano.name + " tem, " + fulano.age + " anos"+ ". Endereço: " + fulano.address);

        Person ciclano = new Person();
        ciclano.name = "Ciclando";
        ciclano.age = 40;
        ciclano.address = "na academia mais próxima";
        System.out.println(ciclano.name + ", " + ciclano.age + " anos. " + ciclano.address);*/

        // #2
        Person beltrano = new Person("Beltrano", 57, "Belford Roxo");
        System.out.println(beltrano.name + ", " + beltrano.age + " anos. "  + beltrano.address);

        // #3
        Car civic = new Car("Honda", "Civic", 2015, 5, 102, "Manual");
        System.out.println(civic.year+ ", "+ civic.make + " "  + civic.model +  ", " + civic.horse_power + " HP. " + civic.gearshift);

        // #4
        civic.StartEngine(civic.model);

        // #5
        Circle circle = new Circle(8);
        double circleArea = circle.calculateArea();
        System.out.println("A área do círculo é: " + circleArea);

        Rectangle rectangle = new Rectangle(3, 9);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("A área do retângulo é: " + rectangleArea);

        // #6
        System.out.println();
        circle.draw();
        rectangle.draw();

        // #7
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva seu nome");
        String name = input.nextLine();
        System.out.println("Sua idade:");
        int age = input.nextInt();

        System.out.println(name + ", " + age);
    }
}