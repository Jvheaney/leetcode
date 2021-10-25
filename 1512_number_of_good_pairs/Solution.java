class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        int[] count = new int[101];
        
        for (int i = 0; i<nums.length; i++) {
            res += count[nums[i]]++;
        }
        
        return res;
    }
}
