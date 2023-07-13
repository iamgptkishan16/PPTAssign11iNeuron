/*Question[4]----Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return *this repeated number*.

You must solve the problem **without** modifying the array `nums` and uses only constant extra space.

**Example 1:** Input: nums = [1,3,4,2,2]
Output: 2*/


public class RepeatedNumberFinder {
    public static int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];

        // Find the intersection point of the tortoise and hare
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the entrance to the cycle (repeated number)
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return tortoise;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int repeatedNumber = findDuplicate(nums);
        System.out.println(repeatedNumber);
    }
}
