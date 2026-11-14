class Solution {
    public boolean isValid(String s) {
        while (s.length() > 0) {
            int len = s.length();

            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");

            if (s.length() == len) {
                return false;
            }
        }
        return true;
    }
}