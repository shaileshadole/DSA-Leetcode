class Solution {

    public boolean check(String w1, String w2) {
        if (w1.length() > w2.length()) return false; // w1 must fit inside w2

        // prefix check
        for (int i = 0; i < w1.length(); i++) {
            if (w1.charAt(i) != w2.charAt(i)) {
                return false;
            }
        }

        // suffix check
        for (int i = 0; i < w1.length(); i++) {
            if (w1.charAt(w1.length() - 1 - i) != w2.charAt(w2.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public int countPrefixSuffixPairs(String[] words) {

        int n = words.length;
        int ans = 0;
        
        for(int i = 0; i < n - 1; i++){
            for(int j = i+1; j < n; j++){
                if(check(words[i], words[j])){
                    ans++;
                }
            }
        }

        return ans;
    }
}