class Solution {
    public boolean squareIsWhite(String coordinates) {
        //if letter is "even" and number is even, white
        //if letter is "even" and number is odd, black
        //if letter is "odd" and number is even, "black"
        //if letter is "odd" and number is odd, white
        int letterCheck = ((int) coordinates.charAt(0) - 97) % 2;
        int numberCheck = ((int) coordinates.charAt(1)) % 2;
        if(letterCheck == 0){
            if(numberCheck == 0){
                return true;
            }
            return false;
        }
        else{
            if(numberCheck == 1){
                return true;
            }
            return false;
        }
    }
}
