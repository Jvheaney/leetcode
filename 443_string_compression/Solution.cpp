class Solution {
public:
    int compress(vector<char>& chars) {
        if(chars.size() == 1){
            return 1;
        }
        std::stack<pair<char,int>> seen;
        
        for(int i = 0; i<=chars.size(); i++){
            char temp = chars[i];
            if(i == chars.size() || (!seen.empty() && seen.top().first != temp)){
                int count = 0;
                int index = 0;
                while(!seen.empty()){
                    count++;
                    index = seen.top().second;
                    seen.pop();
                }
                if(count > 1) {
                    chars[index + 1] = count;
                    if(i == chars.size()){
                        return index + 2;
                    }
                }
                
            }
            seen.push({temp, i});
        }
        return 1;
    }
};
