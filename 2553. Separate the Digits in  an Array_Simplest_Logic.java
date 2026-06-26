class Solution {
    public int[] separateDigits(int[] nums) {
        int totalLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            while (temp > 0) {
                totalLength++;
                temp = temp / 10;
            }
        }
        
        int[] Answer = new int[totalLength];
        int idx = totalLength - 1;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            int currentNum = nums[i];
            while (currentNum > 0) {
                int CurrentElement = currentNum % 10;
                Answer[idx] = CurrentElement;
                idx--;
                currentNum = currentNum / 10;
            }
        }
        
        return Answer;
    }
}
