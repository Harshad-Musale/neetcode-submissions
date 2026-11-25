class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        if(k>s2.length()){
        return false;
        }
        int[] s1Freq=new int[26];
        int[] s2Freq=new int[26];
        for(int i=0; i<k; i++){
            s1Freq[s1.charAt(i)-'a']++;
             s2Freq[s2.charAt(i)-'a']++;
        }
       if (Arrays.equals(s1Freq, s2Freq)) return true;
        for(int r=s1.length(); r<s2.length(); r++){
            s2Freq[s2.charAt(r)-'a']++;
            s2Freq[s2.charAt(r-k)-'a']--;
             if(Arrays.equals(s1Freq,s2Freq)) return true;
        }
        return false;
    }
}
