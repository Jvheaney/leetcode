class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int iterator = 0;
        int words = 1;
        
        do {
            if(!((iterator + searchWord.length()) > sentence.length()) &&
               sentence.substring(iterator, iterator + searchWord.length()).equals(searchWord)) {
                return words;
            }
            iterator = sentence.indexOf(" ", iterator+1) + 1;
            words++;
        } while(iterator < sentence.length() && iterator != 0);
        
        return -1;
        
    }
}
