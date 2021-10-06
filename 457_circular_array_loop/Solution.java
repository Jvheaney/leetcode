class Solution {
    /*
        It looks like this one is either broken or worded poorly...
    */
    public boolean circularArrayLoop(int[] nums) {
        Map<Integer, Integer> seen = new LinkedHashMap();
        int current = 0;
        
        while(!seen.containsKey(current)) {
            
            seen.put(current, nums[current]);
            
            current += nums[current];
            
            if(current >= nums.length){
                current -= nums.length;
            }
            else if(current < 0){
                current += nums.length;
            }
        
        }
        
        if(seen.size() <= 1) {
            return false;
        }
        
        for (Map.Entry<Integer,Integer> entry : seen.entrySet()) {
            if(entry.getValue() < 0){
                return false;
            }
        }
        
        return true;
        
    }
}
