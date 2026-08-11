class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int ans=0;
        int ele=0;
        for(int j : nums){
            if(cnt==0){
                cnt=1;
                ele=j;
            }else if(ele==j){
                cnt++;
            }else{
                cnt--;
            }
        }
        cnt=0;
        for(int k : nums){
            if(k==ele){
                cnt++;
            }

        }
        return cnt>nums.length/2 ?ele:-1;

    }
}