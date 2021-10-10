class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        std::stack<pair<int,int>> nwd; //next warmer day
        std::vector<int> daysToWait(temperatures.size());
        std::fill(daysToWait.begin(), daysToWait.end(), 0);
        
        for(int i = 0; i<temperatures.size(); i++){
            while(!nwd.empty() && nwd.top().first < temperatures[i]){
                daysToWait[nwd.top().second] = i - nwd.top().second;
                nwd.pop();
            }
            nwd.push({temperatures[i], i});
        }
        
        return daysToWait;
    }
};
