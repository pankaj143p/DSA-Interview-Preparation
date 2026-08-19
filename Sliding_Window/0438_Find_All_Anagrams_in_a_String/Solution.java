class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        int[] fre = new int[26];
        int[] fre1 = new int[26];

        for (char ch : p.toCharArray()) {
            fre[ch - 'a']++;
        }

        int n = s.length();
        int m = p.length();

        if (m > n) {
            return result;
        }

        for (int i = 0; i < n; i++) {

            // Add current character
            fre1[s.charAt(i) - 'a']++;

            // Remove character leaving the window
            if (i >= m) {
                fre1[s.charAt(i - m) - 'a']--;
            }

            // Check when window size becomes m
            if (i >= m - 1 && Arrays.equals(fre, fre1)) {
                result.add(i - m + 1);
            }
        }

        return result;
    }
}