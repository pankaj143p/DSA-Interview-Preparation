class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int mx=0;
        for(int l=0, r=0; r<s.length(); r++){
            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            mx=Math.max(mx, r-l+1);
        }
        return mx;
    }
}


