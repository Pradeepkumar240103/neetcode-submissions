class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m= new HashMap<>();
        int i=0;
        while(i<nums.length){
            if(m.containsKey(target-nums[i])){
                return new int[]{m.get(target-nums[i]),i};
            }
            m.put(nums[i],i);
            i++;
        }
        return new int[]{0,0};
    }
}
