class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        
        for(int i = 0; i<word1.length(); i++){
            if(i == word2.length()){
                return merged + word1.substring(i);
            }
            if(i == word1.length() - 1 && word2.length() > word1.length()){
                return merged + word1.substring(i) + word2.substring(i);
            }
            merged += word1.substring(i,i+1) + word2.substring(i,i+1);
        }
        return merged;
    }
}
