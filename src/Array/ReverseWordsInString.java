package Array;

public class ReverseWordsInString {

    public String changeOrderOfSentence(String s) {
        // Split the input string by spaces and filter out empty strings (caused by multiple spaces).
        String[] words = s.trim().split("\\s+");

        // Use StringBuilder to construct the reversed sentence.
        StringBuilder result = new StringBuilder();

        // Iterate over the words array in reverse order.
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            // Add a space between words, but avoid a trailing space at the end.
            if (i != 0) {
                result.append(" ");
            }
        }

        // Convert StringBuilder to String and return.
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        ReverseWordsInString reverser = new ReverseWordsInString();
        System.out.println(reverser.changeOrderOfSentence(s));
    }
}
