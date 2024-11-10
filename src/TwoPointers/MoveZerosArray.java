package TwoPointers;

public class MoveZerosArray {

    public static void moveZeroes(int[] arr) {
        int nonZeroIndex = 0; // Position to place the next non-zero element

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Fill the rest of the array with zeros
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);

        // Print the result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
