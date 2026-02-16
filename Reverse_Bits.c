int reverseBits(int m) {
    unsigned int n=m;
    unsigned int result=0;
    for(int i=0;i<32;i++)
    {
        result=result<<1;
        result|=(n&1);
        n=n>>1;
    }
    return result;
    // printf("%u",result);
}