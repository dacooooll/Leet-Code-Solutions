class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0;
        int sumOdd = 0;
        int oddVal = 1;
        int evenVal = 2;
        
        for (int i = 1; i <= n; i++) {
            sumOdd = sumOdd + oddVal;
            sumEven = sumEven + evenVal;
            oddVal = oddVal + 2;
            evenVal = evenVal + 2;
        }
        
        return gcd(sumEven, sumOdd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

