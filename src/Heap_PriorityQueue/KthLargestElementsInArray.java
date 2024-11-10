package Heap_PriorityQueue;

import java.util.PriorityQueue;

public class KthLargestElementsInArray {
	 public int findKthLargest(int[] nums, int k) {
	        // Min-heap to keep track of the k largest elements
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	        
	        // Add each element to the min-heap
	        for (int num : nums) {
	            minHeap.add(num);
	            
	            // If the heap size exceeds k, remove the smallest element
	            if (minHeap.size() > k) {
	                minHeap.poll();
	            }
	        }
	        
	        // The root of the heap is the kth largest element
	        return minHeap.peek();
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	    	KthLargestElementsInArray solution = new KthLargestElementsInArray();

	        // Example 1
	        int[] nums1 = {3, 2, 1, 5, 6, 4};
	        int k1 = 2;
	        System.out.println("Example 1:");
	        System.out.println("Input: nums = [3, 2, 1, 5, 6, 4], k = 2");
	        System.out.println("Expected Output: 5");
	        System.out.println("Actual Output: " + solution.findKthLargest(nums1, k1));
	        System.out.println();

	        // Example 2
	        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
	        int k2 = 4;
	        System.out.println("Example 2:");
	        System.out.println("Input: nums = [3, 2, 3, 1, 2, 4, 5, 5, 6], k = 4");
	        System.out.println("Expected Output: 4");
	        System.out.println("Actual Output: " + solution.findKthLargest(nums2, k2));
	    }

}
