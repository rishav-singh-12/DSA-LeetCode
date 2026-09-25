class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        int left = 0;
        int right = 0;
        boolean same = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                same = false;
                if (left == 0) {
                    left = i;
                } else {
                    right = i;
                    break;
                }
            }
        }
        if (same) {
            return true;
        }
        char temp = arr1[left];
        arr1[left] = arr1[right];
        arr1[right] = temp;

        return new String(arr1).equals(s2);
    }
}