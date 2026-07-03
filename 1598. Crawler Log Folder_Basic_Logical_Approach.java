class Solution {
    public int minOperations(String[] logs) {
        int minSteps = 0;
        String Backward = "../";
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals(Backward)) {
                //Moving to parent means steps reduced.
                if (minSteps > 0) {
                    minSteps -= 1;
                }
            } else if (logs[i].equals("./")) {
                // Keep the value same as no movement.
                minSteps = minSteps;
            } else {
                // Any other string would be considered as moving onto next directory, meaning increment.
                minSteps += 1;
            }
        }
        return minSteps;
    }
}
