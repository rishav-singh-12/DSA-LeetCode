class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for (int n : nums) {
            low = Math.max(low, n);
            high += n;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            int parts = 1;
            int sum = 0;

            for (int n : nums) {
                if (sum + n > mid) {
                    parts++;
                    sum = 0;
                }
                sum += n;
            }
            if (parts <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}