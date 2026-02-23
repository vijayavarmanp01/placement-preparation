class Solution {
    public boolean hasAlternatingBits(int n) {
       int m=n;
       int[] bi=new int[32];
       int i=0;
       while(n>0)
       {
        bi[i]=n%2;
        n/=2;
        i++;
       }
       int l=0;
       for(int j=1;j<i;j++)
       {
            if(bi[l]==bi[j])
            {
                return false;
            }else{
                l++;
            }
       }
       return true;
    }
}
