class Solution {
    public int reverse(int num) {
        int x=num;
        if(x<0) x=x*-1;
        int rev=0;
        while(x>0){
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10)
            return 0;
            rev=rev*10+(x%10);
            x/=10;
        }
        return (num<0) ? rev*-1 : rev;
    }
}