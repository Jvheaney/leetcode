public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ret = 0; 
        for (int i = 0; i < 32; i++) {
            ret = ret << 1; //shift to left
            ret = ret | (n & 1); //get last digit
            n = n >> 1; //shift to right
        }
        return ret;
    }
}
