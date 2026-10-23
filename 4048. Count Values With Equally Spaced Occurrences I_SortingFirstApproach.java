import java.util.Arrays;

class Solution {
    public int countSpecialIntegers(int[] nums) {
        int specialCount = 0;
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new int[]{nums[i], i};
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        for (int j = 0; j < pairs.length - 2; j++) {
            if((j == 0 || pairs[j-1][0] != pairs[j][0]) && pairs[j][0] == pairs[j+1][0] && pairs[j+1][0] == pairs[j+2][0] && (j + 3 >= pairs.length || pairs[j+2][0] != pairs[j+3][0])) {
                if((pairs[j+1][1] - pairs[j][1]) == (pairs[j+2][1] - pairs[j+1][1])) {
                    specialCount += 1;
                    j += 2;
                }
            }
        }
        return specialCount;
    }
}
