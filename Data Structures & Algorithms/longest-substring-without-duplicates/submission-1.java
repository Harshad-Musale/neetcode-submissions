class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, ans=0;
        HashSet<Character> set= new HashSet<>();
        while(l<=r && r<s.length()){
                // set.put(s.charAt())
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
                r++;
            ans=Math.max(ans, set.size());
        }
        return ans;
    }
}
