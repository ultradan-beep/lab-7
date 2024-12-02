import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int longestConsecutive(int[] nums) {

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;


        for (int num : numSet) {

            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Update the maximum streak length
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {100, 4, 200, 1, 3, 2};

        System.out.println("Test Case: ");
        System.out.println("Input: [100, 4, 200, 1, 3, 2]");
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums1));

    }
}
