import java.util.Scanner;

public class Homework3_Question1 {
    public static void main(String[] args){
 
        // scanner utility is used to declare and initialize a variable 'input' that will store what the user types in the terminal 
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of elements: \t");
        /*
         * a variable of the integer datatype named 'SIZE' is declared and intialized with the 'input' variable from the Scanner class and the .nextInt() method to grab the number the user enters
         */
        int SIZE = input.nextInt();
        System.out.println();
        
        // an array is declared named 'numArr' and intialized with 'SIZE' variables value
        int[] numArr = new int [SIZE]; 
        
        // integer variables 'sum', 'avg', 'min', & 'max' are declared aand intialized with the value 0. These will be updated with new values
        int sum = 0;
        float avg = 0;
        int min = 0;
        int max = 0;

        System.out.print("Enter " + SIZE + " integers: \t"); // prints size of array that the user entered

        for(int i = 0; i < numArr.length; i++){

                // assigns the max and mix the values of the first index while looping to be used as comparison and determine the max and min
                min = numArr[0];
                max = numArr[0];

                // loops through array and adds the numbers the user entered to each index then prints out 'i'
                numArr[i] = input.nextInt();
                System.out.println(numArr[i]);

                sum += numArr[i]; //each index value is added to the sum variable to get sum of whole arrat
                avg += (avg + numArr[i]) / SIZE; //each index is added to the average variables value then divided by the size of the array to get the average

                // as array is looping the index is compared to the 'min' value and if it is lower is it assigned the the 'min' variable
                if(numArr[i] < min){
                    min = numArr[i];
                }
                
                // as array is looping the index is compared to the 'max' value and if it is higher, is it assigned the the 'max' variable
                if(numArr[i] > max){
                    max = numArr[i];
                }

            };

        System.out.println("Sum: " + sum); //sum of the numbers in array is printed to terminal
        System.out.printf("Average: %.2f", avg, "\n"); //average of numbers in array is printed with format method, allowing 2 decimal places to be printed to the terminal
        System.out.println("Minimum: " + min); //smallest number is printed to the terminal
        System.out.println("Maximum: " + max); // largest number is printed to the terminal

        input.close(); //closes input variable from Scanner class

    }
}