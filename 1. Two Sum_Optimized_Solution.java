import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        int value1 = 0;
        int value2 = 0;
        for (int i = 0; i < sortedNums.length; i++) {
            value1 = sortedNums[i];
            int requiredValue = target - value1;
            int foundIndex = Arrays.binarySearch(sortedNums, i + 1, sortedNums.length, requiredValue);
            if (foundIndex >= 0) {
                value2 = sortedNums[foundIndex];
                break; // We found our two values! Stop the loop.
            }
        }
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value1 && index1 == -1) {
                index1 = i;
            } else if (nums[i] == value2 && index2 == -1) {
                index2 = i;
            }
        }
        
        return new int[] {index1, index2};
    }
}
