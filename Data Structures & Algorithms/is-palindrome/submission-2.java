class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        if(n==1 || n==0){
            return true;
        }
        s=s.toLowerCase();
        int start=0; 
        int end=n-1;
        while(start<end){
           while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
            start++;
           }
           while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
            end--;
           }
           if(s.charAt(start) != s.charAt(end)){
              return false;
           }
           start++;
           end--;
        }
        return true;
    }
}
