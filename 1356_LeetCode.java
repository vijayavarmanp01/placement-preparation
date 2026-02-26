import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {

        List<List<Integer>> buckets = new ArrayList<>();

        for(int i = 0; i <= 32; i++)
            buckets.add(new ArrayList<>());

        for(int num : arr) {
            int bits = Integer.bitCount(num);
            buckets.get(bits).add(num);
        }

        int index = 0;

        for(List<Integer> bucket : buckets) {
            Collections.sort(bucket); // sort same-bit numbers
            for(int num : bucket)
                arr[index++] = num;
        }

        return arr;
    }
}

