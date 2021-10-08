class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        std::string merged = "";
        
        for(int i = 0; i<word1.size(); i++){
            if(i == word2.size()){
                merged += word1.substr(i,word1.size());
                return merged;
            }
            if(i == word1.size() - 1 && word2.size() > word1.size()){
                merged += word1.substr(i,1) + word2.substr(i, word2.size());
                return merged;
            }
            merged += word1.substr(i,1) + word2.substr(i,1);
        }
        
        return merged;
    }
};
