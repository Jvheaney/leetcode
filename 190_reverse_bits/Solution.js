/**
 * @param {number} n - a positive integer
 * @return {number} - a positive integer
 */
var reverseBits = function(n) {
    var binary = n.toString(2);
    return parseInt(binary.split("").reverse().join("") + "0".repeat(32 - binary.length), 2);
};
