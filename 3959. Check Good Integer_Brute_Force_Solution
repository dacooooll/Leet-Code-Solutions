class Solution {
    public boolean checkGoodInteger(int n) {
        int digit;
        int digitSum = 0;
        int squareSum =0;
        while(n>0)
        {
            digit=n%10;
            n=n/10;
            digitSum = digitSum + digit;
            squareSum =    (digit*digit) + squareSum;     
        }
    if (squareSum - digitSum >= 50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
