class Solution {
    public int numRookCaptures(char[][] board) {
        int availableToAttack = 0;
        int rookx = -1;
        int rooky = -1;
        for(int i = 0; i<board.length; i++){
            
            for(int j = 0; j<board[i].length; j++){
                
                //check if rook
                if(board[i][j] == 'R'){
                    rookx = j;
                    rooky = i;
                }
                
                //if rookx != -1 and there is a bishop, the row is done. break.
                if(rookx != -1 && board[i][j] == 'B'){
                    break;
                }
                
                
                //if rookx != -1 and availableToAttack is not 2, we can add another 1 to avaibletoattack and break
                if(rookx != -1 && board[i][j] == 'p'){
                    availableToAttack++;
                    break;
                }
                
                if(rookx == -1 && board[i][j] == 'p' && availableToAttack != 1){
                    availableToAttack++;
                }
                
                if(rookx == -1 && board[i][j] == 'B'){
                    if(availableToAttack > 0) {
                        availableToAttack--;
                    }
                }
                
                
            }
            
            if(rookx != -1){
                //we have found the rook
                break;
            }
            
            availableToAttack = 0;
            
        }
        
        //Check column
        boolean foundPawnBefore = false;
        for(int i = 0; i<board.length; i++){
            //if we have passed the rook and we find a bishop, we are done.
            if(i > rooky && board[i][rookx] == 'B'){
                break;
            }
            
            //if we have passed the rook and we find a pawn
            if(i > rooky && board[i][rookx] == 'p'){
                availableToAttack++;
                break;
            }
            
            //if we are before the rook and find a pawn
            if(i < rooky && board[i][rookx] == 'p' && !foundPawnBefore){
                availableToAttack++;
                foundPawnBefore = true;
            }
            
            //if we are before the rook and find a bishop
            if(i < rooky && board[i][rookx] == 'B' && foundPawnBefore){
                availableToAttack--;
                foundPawnBefore = false;
            }
        }
        
        return availableToAttack;
    }
}
