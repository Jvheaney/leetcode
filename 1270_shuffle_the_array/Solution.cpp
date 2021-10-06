class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        std::vector<int> ret(n*2);
        for(int i = 0; i < n; i++){
            ret[i*2] = nums[i];
            ret[(i*2) + 1] = nums[i + n];
        }
        return ret;
    }
};
