import java.util.Arrays;
class Solution {
    public int minimumSum(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        int SortedNum = Integer.parseInt(new String(digits));
        int num1 = (digits[0] - '0') * 10 + (digits[2] - '0');
        int num2 = (digits[1] - '0') * 10 + (digits[3] - '0');
        int sum = num1 + num2;   
        return sum;
        }
}
