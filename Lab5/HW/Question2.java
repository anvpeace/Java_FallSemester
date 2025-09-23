public class Question2{
    public static void main(String[] args){
        /*
         * Given 2D array for problem 1 and 2
            1 2 3 4
            5 6 7 8
            9 10 11 12
            
            2. Calculate and print the sum of each column

            Example:
            Sum of column 0: 15
            Sum of column 1: 18
            Sum of column 2: 21
            Sum of column 3: 24
            Hint : Sum of Columns
            
            You can loop over column indices first (outer loop) and then loop over rows (inner loop).
         */
                 int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
         };

        // int sum = 0;

         for (int row = 0; row < arr.length; row++){ //looops through each row

            for(int column = 0; column < arr[row].length; column++){ //loops through each coloumn in the row

                System.out.print(arr[row][column] + " ");

            }
            System.out.println();
        }

        System.out.println();

        for (int column = 0; column < arr[0].length; column++) {

            int sum = 0; 

            for (int row = 0; row < arr.length; row++) {

                sum += arr[row][column];
            }
            System.out.println("Sum of column " + column + ": " + sum);
        }
    }
}