class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result=new ArrayList<>();
        for(int hr=0;hr<12;hr++)
        {
            for(int mi=0;mi<60;mi++)
            {
                int tot=Integer.bitCount(hr)+Integer.bitCount(mi);
                if(tot==turnedOn){
                    String str=hr+":"+(mi<10?"0"+mi:mi);
                    result.add(str);
                }
            }
        }
        return result;
    }
}