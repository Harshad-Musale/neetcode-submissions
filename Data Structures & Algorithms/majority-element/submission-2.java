class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int curr=0;
        for(int i=0; i<n; i++){
            if(cnt==0){
                curr= nums[i];
                cnt++;
            }
            else if(i<n-1 && nums[i]==curr){
                cnt++;
            }
           else if(i<n-1 && nums[i]!=curr){
                cnt--;
            }
        }
        return curr;
    }
}