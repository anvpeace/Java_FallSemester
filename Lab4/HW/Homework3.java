import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        /*
         * 
         * Task:

                Ask the user to enter N integers (where N can be any positive number).
                Store the numbers in an array.
                Calculate and print the following:
                    Sum of all numbers
                    Average of the numbers
                    Minimum value
                    Maximum value

            Example Input:

            Enter the number of elements: 5
            Enter 5 integers: 10 20 30 40 50

            Expected Output:

            Sum = 150
            Average = 30.0
            Minimum = 10
            Maximum = 50

         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: \t");
        int SIZE = input.nextInt();
        System.out.println();
        
        int[] numArr = new int [SIZE]; 


        System.out.print("Enter " + SIZE + " integers: \t");

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = input.nextInt();
            System.out.println(numArr[i]);

        };

        input.close();




    }
}