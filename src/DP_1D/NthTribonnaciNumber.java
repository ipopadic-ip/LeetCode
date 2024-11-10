package DP_1D;

public class NthTribonnaciNumber {
    public int tribonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        // Initialize the first three values
        int t0 = 0, t1 = 1, t2 = 1;
        int tn = 0;

        // Calculate Tribonacci from T3 to Tn
        for (int i = 3; i <= n; i++) {
            tn = t0 + t1 + t2;
            // Shift values for the next iteration
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }

        return tn;
    }

    // Main method for testing
    public static void main(String[] args) {
    	NthTribonnaciNumber solution = new NthTribonnaciNumber();

        // Example 1
        int n1 = 4;
        System.out.println("Example 1:");
        System.out.println("Input: n = " + n1);
        System.out.println("Expected Output: 4");
        System.out.println("Actual Output: " + solution.tribonacci(n1));
        System.out.println();

        // Example 2
        int n2 = 25;
        System.out.println("Example 2:");
        System.out.println("Input: n = " + n2);
        System.out.println("Expected Output: 1389537");
        System.out.println("Actual Output: " + solution.tribonacci(n2));
    }
}

