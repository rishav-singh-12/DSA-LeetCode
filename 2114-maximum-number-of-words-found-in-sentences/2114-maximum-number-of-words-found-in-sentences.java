class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;

        for (String sentence : sentences) {
            int words = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    words++;
                }
            }
            count = Math.max(count, words);
        }
        return count;
    }
}