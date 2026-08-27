class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+2];

        for (int x : nums) {
            if (x > 0 && x < freq.length) {
                freq[x]++;
            }
        }

        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}