class Solution {
    public int minFlips(String s) {

        int n = s.length();
        int res = n;
        int count = 0;

        String str = s + s;

        for (int i = 0; i < 2 * n; i++) {

            char expected = (i % 2 == 0) ? '0' : '1';

            if (str.charAt(i) != expected)
                count++;

            if (i >= n) {
                int left = i - n;

                char expLeft = (left % 2 == 0) ? '0' : '1';

                if (str.charAt(left) != expLeft)
                    count--;
            }

            if (i >= n - 1) {
                int count2 = n - count;
                res = Math.min(res, Math.min(count, count2));
            }
        }

        return res;
    }
}