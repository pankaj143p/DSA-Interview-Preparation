class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] freq = new int[256];

        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int minValue = Integer.MAX_VALUE;
        int left = 0;
        int count = 0;
        int startIndex = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (freq[ch] > 0) {
                count++;
            }

            freq[ch]--;

            while (count == t.length()) {

                if (minValue > right - left + 1) {
                    minValue = right - left + 1;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);

                freq[leftChar]++;

                if (freq[leftChar] > 0) {
                    count--;
                }

                left++;
            }
        }

        if (minValue == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(startIndex, startIndex + minValue);
    }
}