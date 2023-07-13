/*Questioon[8]------Given two integer arrays `nums1` and `nums2`, return *an array of their intersection*. Each element in the result must appear as many times as it shows in both arrays and you may return the result in **any order**.

**Example 1:** Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]*/



import java.util.*;

public class Intersection2Finder {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> intersectList = new ArrayList<>();

        // Count the frequency of each element in nums1
        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the common elements between nums1 and nums2
        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                intersectList.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        // Convert the list to an array
        int[] result = new int[intersectList.size()];
        for (int i = 0; i < intersectList.size(); i++) {
            result[i] = intersectList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = intersect(nums1, nums2);

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

