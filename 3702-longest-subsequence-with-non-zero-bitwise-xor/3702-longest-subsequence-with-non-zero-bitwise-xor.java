class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
        }

        if (xor != 0) {
            return n;
        }

        boolean allZero = true;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                allZero = false;
                break;
            }
        }

        if (allZero) {
            return 0;
        }
        return n - 1;
    }
}