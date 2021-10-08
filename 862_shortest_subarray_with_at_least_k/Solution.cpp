class Solution {
public:
    int shortestSubarray(vector<int>& nums, int k) {
        int len = nums.size();
        int shortest = nums.size() + 1;
        std::vector<int> summation(len + 1);
        std::deque<int> starting;
        
        for(int i = 0; i<len; i++){
            summation[i+1] = summation[i] + nums[i];
        }
        
        for(int i = 0; i<len+1; i++){
            while(!starting.empty() && (summation[i] - summation[starting.at(0)]) >= k){
                int curr = i - starting.at(0);
                if(curr < shortest){
                    shortest = curr;
                }
                starting.pop_front();
            }
            
            while(!starting.empty() && summation[i] <= summation[starting.at(starting.size() - 1)]){
                starting.pop_back();
            }
            
            starting.push_back(i);
        }
        
        if(shortest <= len){
            return shortest;
        }
        
        return -1;
        
    }
};
