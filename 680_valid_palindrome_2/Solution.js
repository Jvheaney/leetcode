/**
 * @param {string} s
 * @return {boolean}
 */
var validPalindrome = function(s) {
    var i = 0;
    var j = s.length-1;
    while(i<j){
        if(s[i] != s[j]){
            return lastChance(s, i+1, j) || lastChance(s, i, j-1);
        }
        i++;
        j--;
    }
    return true;
};

var lastChance = function(s, i, j){
    while(i<j){
        if(s[i] != s[j]){
            return false;
        }
        i++;
        j--;
    }
    return true;
}
