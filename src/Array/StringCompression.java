package Array;

public class StringCompression {

    public static int compress(char[] chars) {
        int write = 0; // Position to write the compressed result
        int read = 0; // Position to read characters

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count occurrences of the current character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the count if greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write; // New length of the compressed array
    }

    public static void main(String[] args) {
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength1 = compress(chars1);
        System.out.println("Compressed Array: ");
        for (int i = 0; i < newLength1; i++) {
            System.out.print(chars1[i] + " ");
        }
        System.out.println("\nNew Length: " + newLength1);

        char[] chars2 = {'a'};
        int newLength2 = compress(chars2);
        System.out.println("Compressed Array: ");
        for (int i = 0; i < newLength2; i++) {
            System.out.print(chars2[i] + " ");
        }
        System.out.println("\nNew Length: " + newLength2);

        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int newLength3 = compress(chars3);
        System.out.println("Compressed Array: ");
        for (int i = 0; i < newLength3; i++) {
            System.out.print(chars3[i] + " ");
        }
        System.out.println("\nNew Length: " + newLength3);
    }
}
