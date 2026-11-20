class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int ans=0;
        for(int num: set){
            if(!set.contains(num-1)){
                int length=0;
                while(set.contains(num+length)){
                    length++;
                }
                ans=Math.max(ans, length);
            }
        }
        return ans;
    }
}
