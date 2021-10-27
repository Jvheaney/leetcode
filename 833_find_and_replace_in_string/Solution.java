class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        String newString = s;
        int[] indexAdjustment = new int[s.length()];
        
        for(int i = 0; i<indices.length; i++){
            if(s.indexOf(sources[i], indices[i]) == indices[i]){
                    newString = replaceAtIndex(indices[i] + indexAdjustment[indices[i]], newString, targets[i], sources[i]);
                
                indexAdjustment = updateIndexAdjustments(indices[i],targets[i].length() - sources[i].length(), indexAdjustment);
            }
        }
        
        return newString;
    }
    
    public String replaceAtIndex(int start, String original, String replacement, String toBeReplaced){
        String ret = "";
        ret = original.substring(0, start) + replacement + original.substring(start + toBeReplaced.length());
        
        return ret;
    }
    
    public int[] updateIndexAdjustments(int start, int increment, int[] original){
        for(int i = start; i<original.length; i++){
            original[i] += increment;
        }
        return original;
    }
}
