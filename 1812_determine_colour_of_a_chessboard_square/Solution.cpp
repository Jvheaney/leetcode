class Solution {
public:
    bool squareIsWhite(string coordinates) {
        int letterCheck = (coordinates.at(0) - 97) % 2;
        int numberCheck = coordinates.at(1) % 2;
        if(letterCheck == 0){
            if(numberCheck == 0){
                return true;
            }
            return false;
        }
        else{
            if(numberCheck == 0){
                return false;
            }
            return true;
        }
    }
};
