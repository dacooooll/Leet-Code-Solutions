import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];

        for (int i = smallest; i >= 1; i--) {
            if (largest % i == 0 && smallest % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
