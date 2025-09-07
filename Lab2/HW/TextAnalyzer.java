
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a sentence:");
        String sentence = sc.nextLine();

        // 1. Print sentence length using .length()

        // System.out.println("Sentence length: " + );

        System.out.println("Sentence length: " + sentence.length());

        // 2. Find index of "Java"
        int index = sentence.indexOf("Java");
        System.out.println("index is: " + index);

        // 3. if index is equal to -1 end main method
        
        if (index == -1){
            System.out.println("terminate main method...");
            return; // exit main method and terminate program.
        }
        String subString = sentence.substring(index);
        System.out.println("Substring: " + subString);

        // 4. Tokenize substring
        StringTokenizer st = new StringTokenizer(subString);
        String firstWord = st.nextToken();
        String secondWord = st.nextToken();

        System.out.println("firstWord: " + firstWord);
        System.out.println("secondWord: " + secondWord);

        // 5. Word lengths and difference
        int len1 = firstWord.length();
        int len2 = secondWord.length();
        System.out.println("first word length: " + len1);
        System.out.println("second word length: " + len2);

        // Compare lengths
        if (len1 == len2) {
            System.out.println("firstWord.length() > secondWord.length()");
        } else {
            System.out.println("firstWord.length() <= secondWord.length()");
        }

        // 6. Concatenated string
        String concatenated = firstWord.concat(secondWord);
        System.out.println("concatenated words: " + concatenated);

        // 7. Check if any word equals "Java"
        if ("java".equalsIgnoreCase(firstWord) || "java".equalsIgnoreCase(secondWord)) {
            System.out.println("One of the words is Java.");
        }

        // 8. Switch statement on first word
            /* based on firstWord value print one of these */
        switch (firstWord) {
            case "Java":
                System.out.println("You like Java!"); // if word is "Java"
                break;
            case "Python":
                System.out.println("You like Python!"); // if word is "Python"
                break;
            
            default:
                System.out.println("Other language detected"); // otherwise

                break;
            };
                    sc.close();


        }
        

    }

