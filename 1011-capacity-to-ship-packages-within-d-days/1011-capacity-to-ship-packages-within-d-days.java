class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        while (low < high) {
            int capacity = low + (high - low) / 2;

            int daysNeeded = 1;
            int currentWeight = 0;

            for (int w : weights) {
                if (currentWeight + w > capacity) {
                    daysNeeded++;
                    currentWeight = 0;
                }

                currentWeight += w;
            }

            if (daysNeeded <= days) {
                high = capacity;
            } else {
                low = capacity + 1;
            }
        }

        return low;
    }
}