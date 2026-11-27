class Solution {
    // 1<= ans>= n
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        // loop 1: clean the array
        for(int i=0; i<n; i++){
            if(nums[i]<=0 || nums[i]>n){
                nums[i]=n+1;
            }
        }
        // loop 2: mark the presence
        for(int i=0; i<n; i++){
            int num=Math.abs(nums[i]);
            if(num> n) continue;

            if(nums[num-1]>0){
                nums[num-1]= -nums[num-1];
            }
        }

        // loop 3: find the first missing positive
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}