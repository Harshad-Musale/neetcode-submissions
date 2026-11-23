class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st=new ArrayDeque<>();
        for(String token: tokens){
             if(token.equals("+")){ 
                st.push(st.pop()+st.pop());
            }
            else if(token.equals("*")){ 
                st.push(st.pop()*st.pop());
            }
           else if(token.equals("/")){
            int n2=st.pop();
            int n1=st.pop();
            st.push(n1/n2);
           }
            else if(token.equals("-")){
            int n2=st.pop();
            int n1=st.pop();
            st.push(n1-n2);
           }
           else
            st.push(Integer.parseInt(token));
           }
        
        return st.pop();
    }
}