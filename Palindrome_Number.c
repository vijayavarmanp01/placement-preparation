bool isPalindrome(int x) {
    long n=x;
    if(x<0) return false;
    long reverse=0;
    while(x!=0)
    {
        reverse=(reverse*10)+(x%10);
        x/=10;
    }
    return (reverse==n);
}