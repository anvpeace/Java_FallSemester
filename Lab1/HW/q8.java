import java.util.Scanner; // Scanner utility is needed to be able to take input from the terminal

public class q8{
    public static void main(String[] arg){


        //variable input is declared from scanner utility then creates constructor that takes input
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Enter a 4 digit integer: "); //displays message to enter integer

        //'UserNumber' variable declared that calls on the scanner 'input' and grabs terminal extry with .Next() method
        String userNumber = input.next(); 

        //charAt() method needs to be used on 'UserNumber' to grab each indexed value from string 'UserNumber'
        System.out.println("First digit: " + userNumber.charAt(0)); 
        System.out.println("Second digit: " + userNumber.charAt(1));
        System.out.println("Third digit: " + userNumber.charAt(2));
        System.out.println("Fourth digit: " + userNumber.charAt(3));


    }
}