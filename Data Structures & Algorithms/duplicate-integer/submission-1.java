class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap newData = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int tempData = nums[i];

            if(newData.containsKey(tempData)){
                return true;
            }
            else{
                newData.put(tempData , 1);
            }

        }

        return false;

        
        
    }
}