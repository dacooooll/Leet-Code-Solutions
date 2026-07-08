class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) return 0;
        
        String x = "";
        long sum = 0;
        int length = (int) Math.log10(Math.abs(n)) + 1;
        
        for(int i = 0; i < length; i++){
            int digit = n % 10;
            if (digit != 0) {
                x = digit + x;
                sum = sum + digit;
            }
            n = n / 10;          
        }
        
        if (x.isEmpty()) return 0;
        
        long xValue = Long.parseLong(x);
        return sum * xValue;
    }
}
