class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(isOpen(c)){
                st.push(c);
            }
            else if(st.isEmpty() || !isMatching(st.peek(), c)){
              return false;
            }
            else{
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public boolean isOpen(char c){
        if(c=='(' || c=='{' || c=='['){
            return true;
        }
        return false;
    }
    public boolean isMatching(char c, char d){
        if(c=='(' && d==')'){
            return true;
        }
        else if(c=='{' && d=='}'){
            return true;
        }
        else if(c=='[' && d==']'){
            return true;
        }
        return false;
    }
}
