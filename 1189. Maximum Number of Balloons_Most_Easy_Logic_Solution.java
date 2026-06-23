class Solution {
    public int maxNumberOfBalloons(String text) {
        int bCount = 0;
        int aCount = 0;
        int nCount = 0;
        int lCount = 0;
        int oCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'b') {
                bCount += 1;
            } else if (letter == 'a') {
                aCount += 1;
            } else if (letter == 'n') {
                nCount += 1;
            } else if (letter == 'l') {
                lCount += 1;
            } else if (letter == 'o') {
                oCount += 1;
            }
        }
        int minOfSingles = Math.min(bCount, Math.min(aCount, nCount));
        lCount = lCount / 2;
        oCount = oCount / 2;
        int minOfDoubles = Math.min(lCount, oCount);
        return Math.min(minOfSingles, minOfDoubles);
    }
}

