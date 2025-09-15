import java.util.Scanner;

public class Homework3_Question2 {
    public static void main(String[] args){

        // scanner utility is used to declare and initialize a variable 'input' that will store what the user types in the terminal
        Scanner input = new Scanner(System.in);

        // the terminal will print out 'Enter a string : '
        System.out.print("Enter a string: ");

        /*
         * a variable of the string datatype named 'userString' is declared and intialized with the 'input' variable from the Scanner class and the .nextLine() method to grab the string the user enters
         */
        String userString = input.nextLine();
        System.out.println(); //println() used to create space after input

        // the string the user entered is printed out to the terminal 
        System.out.println("Original string: " + userString);
        String reversedString = " "; //variable of string datatype declared and init. as empty string - will be used to store string backwards

        int wordSize = userString.length(); //variable 'wordSize' declared and intialized to hold the length of the string the user enters. This will be used to traverse through the string. 
        int v = 0; //int datatype variable declared and intialized - will be used to count vowels in string

        /*
         * for loop that starts at the index equivelant to the strings size, but -1 because arrays start at 0. loop will stop when the value(i) is greater than or equal to 0, as the loop is decrementing from the highest(or last) index in the string.
         */
        for(int i = wordSize - 1; i >= 0; i--){
            /*
             *the empty string initialized called 'reversedString' is storing each character at each index of the original word stored in 'userString' from the last index to the first. This allows the word to appear backwards or reversed
             */
           reversedString += userString.charAt(i);   
           
        }

        /*
         * this for loop iterates through the new value in 'reversedString' variable. as the loop iterates it is checking the character at each index and comparing to see if the value is either 'a', 'e', 'i', 'o', or 'u'. 
         */
        for(int i = 0; i < reversedString.length(); i++){
            if(reversedString.charAt(i) == 'a' || reversedString.charAt(i) == 'e' || reversedString.charAt(i) == 'i' || reversedString.charAt(i) == 'o' || reversedString.charAt(i) == 'u' ){
                    v += 1; //If the char value is one of those vowels the 'v' variable value increases. 

            }
        }



        System.out.println("Reversed: " + reversedString); //terminal prints the original word reversed 
        System.out.println("Vowels: " + v);//terminal prints the amount if vowels sounds in the 'userString'
        
        
        input.close(); //closes input variable from Scanner class
    }
}