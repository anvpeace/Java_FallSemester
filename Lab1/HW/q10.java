import java.util.Scanner;
public class q10{
    public static void main(String[] arg){


        //variable input is declared from scanner utility then creates constructor that takes input
        Scanner input = new Scanner(System.in);

        System.out.println("This program will convert seconds to hours, minutes, and seconds\n");
        System.out.println("Enter an amount of seconds: ");

        //variable is declared that expects and stores the next double value entered in the terminal
        double totalSeconds = input.nextDouble(); 
        double hours = totalSeconds / 3600; //total seconds is divided by the amount of seconds in an hour (3600)
        double remaining = totalSeconds % 3600; // the remaining variable performs modulous on the total seconds to get remainder

        double mins = remaining / 60; //remainder is divided by 60 to get remaining minutes
        double finalSecs = remaining % 60; //modulous is performed to get remaining seconds 

        System.out.println("Seconds entered: " + totalSeconds);


        // format precision is used to get two decimal places after each variables value
        System.out.printf("%.2f seconds = %.2f hours, %.2f minutes, and %.2f seconds.\n",
                totalSeconds, hours, mins, finalSecs);



    }
}