class Solution {
public:
    bool validPalindrome(string s) {
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            if(s.at(i) != s.at(j)){
                return lastChance(s,i+1,j) || lastChance(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }
    
public:
    bool lastChance(string s, int i, int j){
        while(i<j){
            if(s.at(i) != s.at(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
};
