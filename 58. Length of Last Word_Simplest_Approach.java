class Solution {
    public int lengthOfLastWord(String s) {
        String answer = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                answer = answer + s.charAt(i);
            } else if (s.charAt(i) == ' ' && answer.length() > 0) {
                break;
            }
        }
        return answer.length();
    }
}

