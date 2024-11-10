package Array;

public class Merge2Strings {

    public static String mergeStrings(String word1, String word2) {
        // Check constraints
        if (word1.length() < 1 || word1.length() > 100 || word2.length() < 1 || word2.length() > 100) {
            throw new IllegalArgumentException("Both words must have a length between 1 and 100.");
        }
        if (!word1.matches("[a-z]+") || !word2.matches("[a-z]+")) {
            throw new IllegalArgumentException("Both words must contain only lowercase English letters.");
        }

        StringBuilder mergedWord = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0;

        // Merge characters in alternating order
        while (i < len1 || i < len2) {
            if (i < len1) {
                mergedWord.append(word1.charAt(i));
            }
            if (i < len2) {
                mergedWord.append(word2.charAt(i));
            }
            i++;
        }
        
        return mergedWord.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "p";
        
        System.out.println("Word1: " + word1);
        System.out.println("Word2: " + word2);
        
        String result = mergeStrings(word1, word2);
        System.out.println("Merged Result: " + result);
    }
}
