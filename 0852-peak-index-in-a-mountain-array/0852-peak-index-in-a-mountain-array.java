class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = Integer.MIN_VALUE;
        int index = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i]>n) {
                n = arr[i];
                index = i;
            }
        }
        return index;
    }
}