
public class Solution {
    public static void sortColors(int[] nums) {
        int zeros = 0, ones = 0, n = nums.length;
        
        // Count the number of 0s and 1s
        for (int num : nums) {
            if (num == 0) zeros++;
            else if (num == 1) ones++;
        }

        // Fill in 0s
        for (int i = 0; i < zeros; ++i) {
            nums[i] = 0;
        }

        // Fill in 1s
        for (int i = zeros; i < zeros + ones; ++i) {
            nums[i] = 1;
        }

        // Fill in 2s
        for (int i = zeros + ones; i < n; ++i) {
            nums[i] = 2;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example array
        int[] nums = {2, 0, 2, 1, 1, 0};
        
        // Print array before sorting
        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Sort the array
        solution.sortColors(nums);
        
        // Print array after sorting
        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

