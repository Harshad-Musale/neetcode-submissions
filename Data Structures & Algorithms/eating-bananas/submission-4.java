class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int min=1;
        int max=0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        while(min<=max){
            int mid=(min+max)/2;
            if(canFinish(piles, mid, h)){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }
    public boolean canFinish(int[] piles, int mid, int h){
        long hrs=0;
        for(int i: piles){
            hrs+=(long)(i+mid-1)/mid;
        }
       return hrs<=h;
    }
}
