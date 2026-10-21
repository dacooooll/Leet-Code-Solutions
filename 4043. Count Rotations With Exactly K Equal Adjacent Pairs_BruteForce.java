class Solution {
    public int countRotations(String s, int k) {
        int validRotations = 0;
        int n = s.length();
        String doubled = s + s;
        for (int i = 0; i < n; i++) {
            int score = 0;
            String currentRotation = doubled.substring(i, i + n);
            for (int j = 0; j < n; j++) {
                if (j + 1 < n && currentRotation.charAt(j) == currentRotation.charAt(j + 1) && score <= k) {
                    score += 1;
                }
            }
            if (score == k) {
                validRotations += 1;
            }
        }
        return validRotations;
    }
}
