import java.util.*;
import java.lang.*;

class Solution {
    
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int reachable = 0; // Keep track of the farthest index we can reach.

        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) { // If the current index is beyond our reachable range, we cannot reach it.
                return false;
            }

            reachable = Math.max(reachable, i + nums[i]); // Update the farthest reachable index.
        }

        return true; // If we reach this point, it means we can reach the last index.
    }

    // A main method example for testing.  This isn't required but helpful to understand
    // and test the code.
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Can jump: " + sol.canJump(nums1)); // Output: true

        // Test case 2
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Can jump: " + sol.canJump(nums2)); // Output: false

        // Test case 3 - edge
        int[] nums3 = {0};
        System.out.println("Can jump: " + sol.canJump(nums3)); // Output: true
    }
}
