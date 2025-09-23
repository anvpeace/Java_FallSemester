public class Question1{
    public static void main(String[] args){

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

        for (int row = 0; row < arr.length; row++) {

            int sum = 0; // reset for each row

            for (int column = 0; column < arr[row].length; column++) {

                sum += arr[row][column];
            }
            System.out.println("Sum of row " + row + ": " + sum);
        }
         
        

    }
}