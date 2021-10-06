/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    var ret = [n*2];
    for(var i = 0; i < n; i++){
        ret[i*2] = nums[i];
        ret[(i*2) + 1] = nums[i + n];
    }
    return ret;
};
