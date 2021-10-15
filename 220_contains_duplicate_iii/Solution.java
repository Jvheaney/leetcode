class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || t < 0){
           return false; 
        } 
        Map<Long, Long> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
            long bucket = remappedNum / ((long) t + 1);
            if (seen.containsKey(bucket)
                    || (seen.containsKey(bucket - 1) && remappedNum - seen.get(bucket - 1) <= t)
                        || (seen.containsKey(bucket + 1) && seen.get(bucket + 1) - remappedNum <= t)){
               return true; 
            }
                            
            if (seen.entrySet().size() >= k) {
                long lastBucket = ((long) nums[i - k] - Integer.MIN_VALUE) / ((long) t + 1);
                seen.remove(lastBucket);
            }
            seen.put(bucket, remappedNum);
        }
        return false;
    }
}
