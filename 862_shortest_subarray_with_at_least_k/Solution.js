/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var shortestSubarray = function(nums, k) {
    var len = nums.length;
    var shortest = nums.length + 1;
    var summation = new Array(nums.length + 1).fill(0);
    var starting = [];
    
    for(var i = 0; i<len; i++){
        summation[i+1] = summation[i] + nums[i];
    }
    
    for(var i = 0; i< len + 1; i++){
        while(starting.length > 0 && (summation[i] - summation[starting[0]]) >= k){
            var curr = i - starting.shift();
            if(curr < shortest){
                shortest = curr;
            }
        }
        
        while(starting.length > 0 && summation[i] <= summation[starting[starting.length-1]]){
            starting.pop();
        }
        
        starting.push(i);
    }
    
    if(shortest <= len){
        return shortest;
    }
    
    return -1;
    
};
