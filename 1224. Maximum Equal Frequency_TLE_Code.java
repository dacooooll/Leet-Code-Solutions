import java.util.HashMap;

class Solution {
    public int maxEqualFreq(int[] nums) {
        int maxLength = 0;
        int left = 0;
        
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int right = left; right < nums.length; right++) {
            int currentElement = nums[right];
            frequencyMap.put(currentElement, frequencyMap.getOrDefault(currentElement, 0) + 1);

            HashMap<Integer, Integer> countOfFrequenciesMap = new HashMap<>();
            for (int frequency : frequencyMap.values()) {
                countOfFrequenciesMap.put(frequency, countOfFrequenciesMap.getOrDefault(frequency, 0) + 1);
            }

            if (countOfFrequenciesMap.size() == 2) {
                int n = -1;
                int nPlusOne = -1;

                for (int freq : countOfFrequenciesMap.keySet()) {
                    if (n == -1) {
                        n = freq;
                    } else {
                        if (freq > n) {
                            nPlusOne = freq;
                        } else {
                            nPlusOne = n;
                            n = freq;
                        }
                    }
                }

                boolean condition1 = (nPlusOne == n + 1 && countOfFrequenciesMap.get(nPlusOne) == 1);
                boolean condition2 = (n == 1 && countOfFrequenciesMap.get(n) == 1);

                if (condition1 || condition2) {
                    int currentPrefixLength = (right - left + 1);
                    maxLength = Math.max(maxLength, currentPrefixLength);
                }
            } else if (countOfFrequenciesMap.size() == 1) {
                int singleFreq = countOfFrequenciesMap.keySet().iterator().next();
                if (singleFreq == 1 || countOfFrequenciesMap.get(singleFreq) == 1) {
                    int currentPrefixLength = (right - left + 1);
                    maxLength = Math.max(maxLength, currentPrefixLength);
                }
            }
        } 
        return maxLength;
    }
}
