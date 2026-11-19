class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String, List<String>> map= new HashMap<>();
        //grouping in HashMap
        for(int i=0; i<n; i++){
            String curr=strs[i];
            String currSorted=sortString(curr);
            List<String> currList=map.getOrDefault(currSorted, new ArrayList<>());
            currList.add(curr);
            map.put(currSorted, currList);
        }
        List<List<String>> ans= new ArrayList<>();
        for(String s: map.keySet()){
            ans.add(new ArrayList<>(map.get(s)));
        }
        return ans;
    }
    public String sortString(String s){
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
