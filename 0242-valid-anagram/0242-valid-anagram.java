class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int freq[] = new int[26];

        for(char ch1: s.toCharArray()){
            freq[ch1-'a']++;
        }
        for(char ch2: t.toCharArray()){
            freq[ch2-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}