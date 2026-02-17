class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) return null;
        int m=mat.length,n=mat[0].length;
        int[] result=new int[m*n];
        boolean upword=true;
        int i=0,r=0,c=0;
        while(i<m*n)
        {
            result[i++]=mat[r][c];
            if(upword){
                if(c==n-1){r++;upword=false;}
                else if(r==0){c++;upword=false;}
                else{r--;c++;}
            }else{
                if(r==m-1){c++;upword=true;}
                else if(c==0){r++;upword=true;}
                else{r++;c--;}
            }
        }
        return result;
    }
}