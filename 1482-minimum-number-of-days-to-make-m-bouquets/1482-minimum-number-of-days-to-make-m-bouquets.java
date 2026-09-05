class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if ((long)m * k > bloomDay.length) {
            return -1;
        }

        int low = 1;
        int high = 0;

        for (int x : bloomDay) {
            high = Math.max(high, x);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            int bouquets = 0;
            int flowers = 0;

            for (int x : bloomDay) {
                if (x <= mid) {
                    flowers++;

                    if (flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }
                } else {
                    flowers = 0;
                }
            }

            if (bouquets >= m) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}