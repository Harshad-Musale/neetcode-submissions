class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res= new int[k];
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Queue<Integer> minheap=new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(int key: map.keySet()){
            minheap.add(key);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        int i=0;
        while(k>0){
            res[k-1]=minheap.poll();
            k--;
        }
        return res;
    }
}
