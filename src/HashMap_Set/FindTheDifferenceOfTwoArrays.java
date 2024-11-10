package HashMap_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Use sets to hold unique elements from each array
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Add elements of nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }
        
        // Create lists to hold the results
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        
        // Find elements in set1 that are not in set2
        for (int num : set1) {
            if (!set2.contains(num)) {
                result1.add(num);
            }
        }
        
        // Find elements in set2 that are not in set1
        for (int num : set2) {
            if (!set1.contains(num)) {
                result2.add(num);
            }
        }
        
        // Return the results as a list of lists
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(result1);
        answer.add(result2);
        
        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        
        List<List<Integer>> result = findDifference(nums1, nums2);
        
        System.out.println("Result: " + result);
    }
}
