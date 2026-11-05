public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
        String result = "";
        for (int i = 0; i < word.length(); i++) {
         String ins = word.substring(i,i+1);
         result += ins + "\n";
        }
        return result;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        String result = "";
        for (int i = word.length(); i > 0; i--) {
         String ins = word.substring(i-1, i);
         result += ins;
        }
        return result;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        // TODO: Implement this method
        String result = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
        String tracker = sentence;
        while (tracker.indexOf(" ") != -1) {
            int i = tracker.indexOf(" ") + 1;
            result = result.substring(0,i) + result.substring(i,i+1).toUpperCase() + result.substring(i+1);
            tracker = tracker.substring(0,i-1) + "_" + tracker.substring(i);
        }
        return result;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        boolean result;
        String fwStr = word.toLowerCase();
        String revStr = "";
        for (int i = fwStr.length(); i > 0; i--) {
            revStr += fwStr.substring(i-1,i);
        }
        result = fwStr.equals(revStr);
        return result;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        // TODO: Implement this method
        char result = ' ';
        
        return result;
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        // Example:
        System.out.println(printCharacters("hello"));

        System.out.println("\nTesting reverseWord:");
        // Example:
        System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        System.out.println(firstUniqueChar("swiss"));
    }
}
