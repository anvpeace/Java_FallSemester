import java.util.StringTokenizer;
public class Question3{
    public static void main(String[] args){
        /*
         *
            
            3. Print reverse of each word in a sentence

            Print each word reversed on a new line using nested loops.
            Example Input:
            String sentence = "Hello World";

            Example Output:
            olleH
            dlroW

            hint:

            • option 1: while + for -> tokenizer.hasMoreTokens()
            • option 2: for + for -> tokenizer.countTokens()
         */
        String sentence = "Hello World"; 

        StringTokenizer tokenizer = new StringTokenizer(sentence);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }
    }
}