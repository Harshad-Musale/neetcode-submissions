class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=Integer.MIN_VALUE;
        int r=0;
        for(int i=0; i<weights.length; i++){
            r+=weights[i];
            l=Math.max(l, weights[i]);
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(weights, days, mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean isPossible(int[] weights, int day, int capacity){
        int days=1;
        int currweight=0;
        for(int i=0; i< weights.length; i++){
            if(weights[i]+currweight>capacity){
                days++;
                currweight=weights[i];
            }
            else{
                currweight+=weights[i];
            }
        }
        if(days<=day){
            return true;
        }
        return false;
    }
}