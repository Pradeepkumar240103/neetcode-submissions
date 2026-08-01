class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int[] freq= new int[k];
        PriorityQueue<Integer> pq=new PriorityQueue<>((c,b)->map.get(b)-map.get(c));

        pq.addAll(map.keySet());
        for(int i=0;i<freq.length;i++){
            freq[i]=pq.poll();
        }
        return freq;
    }
}
