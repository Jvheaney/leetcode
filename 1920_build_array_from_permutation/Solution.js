/**
 * @param {number[]} nums
 * @return {number[]}
 */
var buildArray = function(nums) {
    var ret = [];
    for(var i = 0; i<nums.length; i++) {
        ret[i] = nums[nums[i]];
    }
    return ret;
};
