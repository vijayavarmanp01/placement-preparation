class Solution {
    public int numSteps(String s) {
        
        int count=0;
        while(s.length()>1){
            if (s.charAt(s.length() - 1) == '0')
            {
                s = s.substring(0, s.length() - 1);
            }
            else{
                char[] arr = s.toCharArray();
int i = arr.length - 1;

while (i >= 0 && arr[i] == '1') {
    arr[i] = '0';
    i--;
}

if (i >= 0) {
    arr[i] = '1';
    s = new String(arr);
} else {
    s = "1" + new String(arr);
}
            }
            count++;
        }
        return count;
    }a
}
