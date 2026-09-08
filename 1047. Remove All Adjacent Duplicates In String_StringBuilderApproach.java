class Solution {
    public String removeDuplicates(String s) {
        StringBuilder Answer = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int length = Answer.length();
            
            if (length > 0 && Answer.charAt(length - 1) == current) {
                Answer.deleteCharAt(length - 1);
            } else {
                Answer.append(current);
            }
        }
        
        return Answer.toString();
    }
}
