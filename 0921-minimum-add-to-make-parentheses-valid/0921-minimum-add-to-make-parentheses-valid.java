class Solution {
    public int minAddToMakeValid(String s) {
        int x = 0;
        int count = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                x++;
            } else {
                if (x > 0) {
                    x--;
                } else {
                    count++;
                }
            }
        }
        return count + x;
    }
}