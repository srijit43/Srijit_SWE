import java.util.Scanner;

public class WordCountBasic {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        
        String s = input.nextLine();

        // Call method to count words
        int wordCount = countWords(s);

        // Display result
        System.out.println("Number of words in the string: " + wordCount);
    }

    // Method to count words in a string
    public static int countWords(String str) {
        int count = 0;
        boolean isWord = false;
        int endOfLine = str.length() - 1;

        // Traverse the string by characters
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is not a space
            if (str.charAt(i) != ' ') {
                isWord = true;
            } else if (str.charAt(i) == ' ' && isWord) {
                // If current character is a space and we were in a word, increment the count
                count++;
                isWord = false;
            }

            // If the last character is a word, we count it
            if (i == endOfLine && isWord) {
                count++;
            }
        }
        return count;
    }
}