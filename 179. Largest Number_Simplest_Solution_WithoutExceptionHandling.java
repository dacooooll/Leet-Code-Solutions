class Solution {
    public String largestNumber(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            String String1 = Integer.toString(nums[i]);
            String String2 = Integer.toString(nums[i + 1]);
            String Compare1 = String1 + String2;
            String Compare2 = String2 + String1;
            int Concatinate = Compare1.compareTo(Compare2);
            if (Concatinate > 0) {
                nums[i + 1] = Integer.parseInt(Compare1);
            } else if (Concatinate < 0 || Concatinate == 0) {
                nums[i + 1] = Integer.parseInt(Compare2);
            }
        }
        String Answer = Integer.toString(nums[nums.length - 1]);
        return Answer;
    }
}
