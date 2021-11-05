class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        HashSet<Pair<Integer,Integer>> visited = new HashSet<Pair<Integer,Integer>>();
        
        visited.add(new Pair(x,y));
        
        for(int i = 0; i<path.length(); i++){
            switch(path.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                    break;
            }
            
            Pair<Integer,Integer> point = new Pair(x,y);
            
            if(visited.contains(point)){
                return true;
            }
            
            visited.add(point);
            
        }
        
        return false;
    }
}
