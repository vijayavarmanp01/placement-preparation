
class Solution {
    public boolean hasAllCodes(String str, int k) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i <= str.length() - k; i++) {
            set.add(str.substring(i, i + k));
        }

        return set.size() == (1 << k);
    }
}
