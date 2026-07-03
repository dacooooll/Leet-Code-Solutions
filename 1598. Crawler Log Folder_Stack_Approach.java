import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int minOperations(String[] logs) {
        Deque<String> stack = new ArrayDeque<>();
        String Backward = "../";
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals(Backward)) {
                //Moving to parent means steps reduced therefor pop from stack.
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (logs[i].equals("./")) {
                // Keep the value same as no movement.
                stack = stack;
            } else {
                // Any other string would be considered as moving onto next directory, meaning push operation.
                stack.push(logs[i]);
            }
        }
        return stack.size();
    }
}
