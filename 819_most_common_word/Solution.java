class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedHash = new HashSet<String>();
        Map<String, Integer> occurrences = new HashMap<String, Integer>();
        
        String[] paragraphParts = paragraph.replaceAll("\\W+" , " ").toLowerCase().split("\\s+");
        
        for(int i = 0; i<banned.length; i++){
            bannedHash.add(banned[i]);
        }
        
        for(int i = 0; i<paragraphParts.length; i++){
            if(!bannedHash.contains(paragraphParts[i].toLowerCase())){
                Integer res = occurrences.putIfAbsent(paragraphParts[i].toLowerCase(), 1);
                if(res != null){
                    occurrences.put(paragraphParts[i].toLowerCase(), res + 1);
                }
            }
        }
        
        Integer max = (Collections.max(occurrences.values())); 
        for(Map.Entry<String, Integer> entry : occurrences.entrySet()){
            if(entry.getValue() == max){
                return entry.getKey();
            }
        }
        
        return "";
    }
}
