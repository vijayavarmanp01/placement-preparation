class Solution {
    public int thirdMax(int[] nums) {
        Integer First=null;
        Integer Second=null;
        Integer Third=null;
        for(Integer num : nums)
        {
            if(num.equals(First) || num.equals(Second) || num.equals(Third)) continue;
            else if(First==null||num>First){
                Third=Second;
                Second=First;
                First=num;
            }else if(Second==null || num>Second){
                Third=Second;
                Second=num;
            }else if(Third == null || num > Third)
            {
                Third=num;
            }
        }
        if(Third==null)
        {
            return First;
        }
        return Third;
    }

}
