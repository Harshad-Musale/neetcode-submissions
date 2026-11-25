class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq= new int[26];
        int maxWin=0;
        int l=0;
        int maxFreq=0;
        for(int r=0; r<s.length(); r++){
            freq[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq, freq[s.charAt(r)-'A']);
            int winLen=r-l+1;
            if(winLen-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            winLen=r-l+1;
            maxWin=Math.max(maxWin, winLen);
        }
        return maxWin;
    }
}
