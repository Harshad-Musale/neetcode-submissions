class Solution {
    public int largestRectangleArea(int[] heights) {
         int n=heights.length;
        int[] nse=nse(heights);
        int[] pse=pse(heights);
        int[] width= new int[n];
        int maxArea=0;
        for(int i=0; i<n; i++){
            width[i]=nse[i]-pse[i]-1;
        }
        for(int i=0; i<n; i++){
            int area=heights[i]*width[i];
            maxArea=Math.max(area, maxArea);
        }
        return maxArea;
    }
    public int[] nse(int[] heights){
        int n=heights.length;
        Stack<Integer> st= new Stack<>();
        int[] nse= new int[n];
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }
            else{
                 nse[i]=st.peek();
            }
            st.push(i);
        }
        return nse;
    }
    public int[] pse(int[] heights){
         int n=heights.length;
          Stack<Integer> st= new Stack<>();
        int[] pse= new int[n];
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                 pse[i]=st.peek();
            }
            st.push(i);
        }
        return pse;
    }
}
