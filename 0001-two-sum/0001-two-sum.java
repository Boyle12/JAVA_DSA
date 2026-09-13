class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            
            int difference = target - currentNum;
            
            if (map.containsKey(difference)) {
                return new int[] { map.get(difference), i };
            }
            
            map.put(currentNum, i);
        }
        
        return new int[] {};
    }
}