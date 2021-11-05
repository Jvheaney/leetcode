class Solution {
    
struct pair_hash {
    inline std::size_t operator()(const std::pair<int,int> & v) const {
        return v.first*31+v.second;
    }
};
    
    
public:
    bool isPathCrossing(string path) {
        int x = 0;
        int y = 0;
        std::unordered_set<std::pair<int,int>, pair_hash> visited;
        
        visited.insert(std::make_pair(x,y));
        
        for(int i = 0; i<path.size(); i++){
            switch (path[i]) {
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
            
            std::pair point = std::make_pair(x,y);
            
            if(visited.count(point) > 0){
                return true;
            }
            
            visited.insert(point);
            
        }
        
        return false;
    }
};
