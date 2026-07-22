class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s=new TreeSet<>(); 
        for(int k:nums){
            s.add(k);
        }
        return s.size()!=nums.length;
    }
}