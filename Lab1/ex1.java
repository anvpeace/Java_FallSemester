import java.util.Scanner;

public class ex1{

    public static void main(String[] arg){

        System.out.println("Hello World");
        // System.out.println("Hello Peace");

        String name;
        String intro = "Hello ";
        name = "Peace";

        System.out.println(intro + name);
        System.out.print(intro + name); // the print doesnt add a new line
        Scanner input = new Scanner(System.in);
        
        String enterName = input.next();

        System.out.println("Enter your name: " + enterName);

        // formatting 
        // format specifier: identifies the first arguement of the printf method

        double price = 20.2;
        System.out.printf("%6.2f", price);
        System.out.println();

        double cost = 19.8;
        String ItemName = "magic apple";
        System.out.printf("$%6.2f for each %s.", cost, ItemName);
        System.out.println();
    };
}