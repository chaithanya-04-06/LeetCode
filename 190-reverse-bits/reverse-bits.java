class Solution {
    public int reverseBits(int n) {
        int rev=0;
        for(int i=0;i<32;i++){
            int lastBit=n&1;
            n>>=1;
            rev<<=1;
            rev|=lastBit;
        }
        return rev;
    }
}