class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map = new HashMap<>();
        
         for(int i = 0; i < nums.length; i++){
            int complement = target-nums[i];
            // agar isme wo element presetn pahle se hi hai then hum return kardenge
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            // agar nahi hai to add kardenge
            map.put(nums[i],i);
        }
        return new int[] {};
        
    }
}