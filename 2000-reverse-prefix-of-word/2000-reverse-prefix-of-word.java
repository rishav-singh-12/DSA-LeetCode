class Solution {
    public String reversePrefix(String word, char ch) {
        int target = word.indexOf(ch);

        if (target == -1) {
            return word;
        }
        
        char[] arr = word.toCharArray();
        int left = 0;
        int right = target;
        
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}