public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));  // Output: 2

        int[] nums2 = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums2)); // Output: 3
    }

    public static int findDuplicate(int[] nums) {
        // Initialize the tortoise and hare
        int tortoise = nums[0];
        int hare = nums[0];

        // First phase: Finding the intersection point of the two runners
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Second phase: Finding the entrance to the cycle
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }
}
