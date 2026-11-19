class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        HashMap<Character, Integer> map= new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0; i<t.length(); i++){
            char c=t.charAt(i);
            if(!map.containsKey(c)){
                return false;
            }
            else{
                map.put(c, map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
            }
        }
        if(map.size()>0){
            return false;
        }
        return true;
    }
}
