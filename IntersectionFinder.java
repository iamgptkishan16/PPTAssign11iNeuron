/*Question[5]------Given two integer arrays `nums1` and `nums2`, return *an array of their intersection*. Each element in the result must be **unique** and you may return the result in **any order**.

**Example 1:** Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]*/




import java.util.*;

public class IntersectionFinder {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        // Add elements of nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }

        // Find the common elements between nums1 and nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }
        }

        // Convert the set to an array
        int[] result = new int[intersect.size()];
        int index = 0;
        for (int num : intersect) {
            result[index] = num;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = intersection(nums1, nums2);

        System.out.print("Intersection: [");
        for (int i = 0; i < intersection.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(intersection[i]);
        }
        System.out.println("]");
    }
}
