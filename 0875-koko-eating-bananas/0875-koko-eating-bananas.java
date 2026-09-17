class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            long hoursNeeded = 0;

            for (int pile : piles) {
                hoursNeeded += (pile + mid - 1) / mid;
            }

            if (hoursNeeded <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}