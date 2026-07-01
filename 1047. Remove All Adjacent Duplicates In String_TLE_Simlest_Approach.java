class Solution {
    public String removeDuplicates(String s) {
        int i = 0;
        String Answer = "";
        while (i < s.length() - 1) {
            String current = String.valueOf(s.charAt(i));
            String next = String.valueOf(s.charAt(i + 1));
            
            if (!current.equals(next)) {
                Answer = current + next;
                i++;
            } else if (current.equals(next)) {
                if (Answer.length() > 0) {
                    Answer = Answer.substring(0, Answer.length() - 1);
                }
                s = s.substring(0, i) + s.substring(i + 2);
                i = 0;
            }
        }
        return s;
    }
}
