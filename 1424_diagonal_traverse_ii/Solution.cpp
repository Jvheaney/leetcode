class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& nums) {
        int maxLength = 0;
        std::map<int, std::vector<int>> result;
        
        for(int y = nums.size() - 1; y >= 0; y--){
            for(int x = 0; x < nums[y].size(); x++){
                if(result.count(y+x) == 0){
                   result.insert({y+x, std::vector<int>()}); 
                }
                result.at(y + x).push_back(nums.at(y).at(x));
                if(y+x > maxLength){
                    maxLength = y+x;
                }
            }
        }
        
        std::vector<int> ans;
        
        for(int i = 0; i <= maxLength; i++){
            for(int j = 0; j < result.at(i).size(); j++){
                ans.push_back(result.at(i)[j]);
            }
        }
        
        return ans;
    }
};
