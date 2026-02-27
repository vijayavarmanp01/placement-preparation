class Solution {
    public int minOperations(String s, int k) {

        int n = s.length();
        int z = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') z++;
        }

        if (z == 0) return 0;

        if (k == n) {
            if (z == n) return 1;
            return -1;
        }

        int o = n - z;
        int base = n - k;

        int ceilZbyK = (z + k - 1) / k;
        int ceilObyBase = (o + base - 1) / base;
        int ceilZbyBase = (z + base - 1) / base;

        int res = Integer.MAX_VALUE;

        // Try odd x
        int oddX = Math.max(ceilZbyK, ceilObyBase);
        if (oddX % 2 == 0) oddX++;
        if ((k % 2) == (z % 2))
            res = Math.min(res, oddX);

        // Try even x
        int evenX = Math.max(ceilZbyK, ceilZbyBase);
        if (evenX % 2 != 0) evenX++;
        if ((z % 2) == 0)
            res = Math.min(res, evenX);

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}

