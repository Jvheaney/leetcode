class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {
        int iterator = -1;
        int words = 1;
        
        do {
            iterator++;
            if(sentence.substr(iterator, searchWord.length()) == searchWord){
                return words;
            }
            
            iterator = sentence.find(" ", iterator + 1);
            words++;
            
        } while(iterator < sentence.length() && iterator != string::npos);
        
        return -1;
    }
};
