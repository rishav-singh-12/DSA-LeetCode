class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;

        for (char ch : s.toCharArray()) {
            int num = ch - 'a' + 1;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        for (int i = 1; i < k; i++) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        return sum;
    }
}