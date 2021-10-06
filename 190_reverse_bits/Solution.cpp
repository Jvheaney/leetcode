class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        uint32_t ret;
        for(int i = 0; i < 32; i++){
            ret = ret << 1; //shift left 1
            ret = ret | (n & 1); //add last digit
            n = n >> 1; //shift right 1
        }
        return ret;
    }
};
