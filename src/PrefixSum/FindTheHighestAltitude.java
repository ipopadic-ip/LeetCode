package PrefixSum;

public class FindTheHighestAltitude {

    public static int findHighestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        // Iterate over the gain array
        for (int g : gain) {
            currentAltitude += g;  // Update current altitude
            maxAltitude = Math.max(maxAltitude, currentAltitude); // Update max altitude if current is higher
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(findHighestAltitude(gain)); // Output: 1
    }
}
