class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int matchLen = 0;
        int[] prefixFreq = freq.clone();
        for (int i = 0; i < n; i++) {
            int ch = target.charAt(i) - 'a';
            if (prefixFreq[ch] > 0) {
                prefixFreq[ch]--;
                matchLen++;
            } else {
                break;
            }
        }

        for (int i = matchLen; i >= 0; i--) {
            int[] currentFreq = freq.clone();
            for (int k = 0; k < i; k++) {
                currentFreq[target.charAt(k) - 'a']--;
            }

            if (i < n) {
                int targetChar = target.charAt(i) - 'a';
                for (int c = targetChar + 1; c < 26; c++) {
                    if (currentFreq[c] > 0) {
                        currentFreq[c]--;
                        
                        StringBuilder sb = new StringBuilder();
                        sb.append(target.substring(0, i));
                        sb.append((char) ('a' + c));

                        for (int j = 0; j < 26; j++) {
                            while (currentFreq[j] > 0) {
                                sb.append((char) ('a' + j));
                                currentFreq[j]--;
                            }
                        }
                        return sb.toString();
                    }
                }
            }
        }

        return "";
    }
}