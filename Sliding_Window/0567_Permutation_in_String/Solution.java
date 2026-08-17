class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s2.length(),m=s1.length();
        if(m>n)return false;
        int fr1[]=new int[26];
        int fr2[]=new int[26];
        for(int i=0;i<m;i++){
            int ch1=s1.charAt(i)-'a';
            int ch2=s2.charAt(i)-'a';
            fr1[ch1]++;
            fr2[ch2]++;
        }
        if(Arrays.equals(fr1,fr2)){
                return true;
        }
        for(int i=1,j=m;j<n;i++,j++){
            char ch1=s2.charAt(i-1);
            char ch2=s2.charAt(j);
            fr2[ch1-'a']--;
            fr2[ch2-'a']++;
            if(Arrays.equals(fr1,fr2)){
                return true;
            }
        }
       return false;
    }
}