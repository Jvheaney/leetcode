class Solution {
public:
    string findReplaceString(string s, vector<int>& indices, vector<string>& sources, vector<string>& targets) {
        map<int, pair<int, string>, greater<int>> mapping;
        
        for (int i = 0; i < indices.size(); i++){
            if (s.compare(indices[i], sources[i].size(), sources[i]) == 0) {
                mapping[indices[i]] = { sources[i].size(), targets[i] };
            }
        }
        
        for (auto row : mapping){
           s.replace(row.first, row.second.first, row.second.second); 
        } 
        return s;
    }
};
