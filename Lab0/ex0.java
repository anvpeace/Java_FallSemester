import java.util.Scanner;

public class ex0{

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

    };
}