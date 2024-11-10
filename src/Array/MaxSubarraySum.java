package Array;

public class MaxSubarraySum {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE; // Smallest possible value
        int currentSum = 0;

        for (int num : arr) {
            // Decide whether to add the current number to the existing sum
            // or to start a new subarray
            currentSum = Math.max(num, currentSum + num);
            
            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(arr));  // Output: 6 (subarray [4, -1, 2, 1])
    }
}
