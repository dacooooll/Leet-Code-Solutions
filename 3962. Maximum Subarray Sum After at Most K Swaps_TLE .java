class Solution {
    public long maxSum(int[] nums, int k) {
        long globalMaxSum = Integer.MIN_VALUE; 
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int[] tempArray = nums.clone();
                for (int step = 0; step < k; step++) {
                    
                    
                    int minOngoingVal = Integer.MAX_VALUE;
                    int minOngoingIdx = -1;
                    for (int m = i; m <= j; m++) {
                        if (tempArray[m] < minOngoingVal) {
                            minOngoingVal = tempArray[m];
                            minOngoingIdx = m;
                        }
                    }
                    int maxRemainingVal = Integer.MIN_VALUE;
                    int maxRemainingIdx = -1;
                    boolean hasRemaining = false;
                    for (int m = 0; m < tempArray.length; m++) {
                        if (m < i || m > j) {
                            hasRemaining = true;
                            if (tempArray[m] > maxRemainingVal) {
                                maxRemainingVal = tempArray[m];
                                maxRemainingIdx = m;
                            }
                        }
                    }
                    if (hasRemaining && minOngoingVal < maxRemainingVal) {
                        // Swap values
                        int temp = tempArray[minOngoingIdx];
                        tempArray[minOngoingIdx] = tempArray[maxRemainingIdx];
                        tempArray[maxRemainingIdx] = temp;
                    } else {
                        break; 
                    }
                }
                long currentSubarraySum = 0;
                for (int m = i; m <= j; m++) {
                    currentSubarraySum += tempArray[m];
                }
                if (currentSubarraySum > globalMaxSum) {
                    globalMaxSum = currentSubarraySum;
                }
            }
        }
        
        return globalMaxSum;
    }
}
