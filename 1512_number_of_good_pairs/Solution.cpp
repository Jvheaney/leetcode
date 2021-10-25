class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int res = 0;
        vector<int> count(101,0);
        
        for(int i = 0; i<nums.size(); i++){
            res += count[nums[i]]++;
        }
     
        return res;
    }
};
