import java.util.Arrays;

class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        boolean flag = false;
        if (nums.length >= 2 && nums[nums.length - 1] == nums.length - 1 && nums[nums.length - 2] == nums.length - 1) {
            flag = true;
            for (int i = 0; i < nums.length - 2; i++) {
                int CurrentElement = nums[i];
                int NextElement = nums[i + 1];
                if (NextElement == CurrentElement + 1) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag && nums[0] != 1) {
                flag = false;
            }
        }
        return flag;
    }
}
