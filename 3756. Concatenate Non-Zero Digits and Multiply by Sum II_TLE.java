class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int mod = 1_000_000_007;
        int[] answer = new int[queries.length];
        for(int j = 0; j < queries.length; j++){
            long sum = 0;
            int left = queries[j][0];
            int right = queries[j][1];
            long num = 0;
            for(int i = left; i <= right; i++){
                int digit = Character.getNumericValue(s.charAt(i));
                if(digit != 0){
                    num = ((num * 10) + digit) % mod;
                    sum = sum + digit;
                }             
            }
            answer[j] = (int) ((num * (sum % mod)) % mod);
        }
        return answer;
    }
}
