class Solution {
    public int countGoodRotations(int[] nums) {
        int goodCount = 0;
        int n = nums.length;
        int[] doubled = new int[n * 2];
        System.arraycopy(nums, 0, doubled, 0, n);
        System.arraycopy(nums, 0, doubled, n, n);
        
        for(int i = 0; i < n; i++) {
            int firstSum = 0;
            int lastSum = 0;
            for(int j = i; j < i + n; j++) {
                if(j < i + (n / 2)) {
                    firstSum += doubled[j];
                } else {
                    lastSum += doubled[j];
                }
            }
            if(firstSum > lastSum) {
                goodCount += 1;
            }
        }
        return goodCount;
    }
}
