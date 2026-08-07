import java.util.Arrays;
class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int mxi = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > mxi) {
                mxi = nums[i];
            }
            prefixGcd[i] = gcd(nums[i], mxi);
        }

        Arrays.sort(prefixGcd);

        long sum = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }

        return sum;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

