class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        int n=nums.length;
        int sum=0;
        map.put(0,1);
        for(int i=0; i<n; i++){
            sum+=nums[i];
            int req=sum-k;
            if(map.containsKey(req)){
                cnt+=map.get(req);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}