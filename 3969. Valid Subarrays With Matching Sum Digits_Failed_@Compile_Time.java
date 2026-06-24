class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int answer = 0;
        for (int left = 0; left < nums.length; left++) {
            int Sum = 0;
            for (int right = left; right < nums.length; right++) {
                Sum = Sum + nums[right];
                
                String SumStr = Integer.toString(Sum);
                int firstDigit = SumStr.charAt(0) - '0';
                
                if (Sum % 10 == x && firstDigit == x) {
                    answer = answer + 1;
                }
            }
        }
        return answer;
    }
}
