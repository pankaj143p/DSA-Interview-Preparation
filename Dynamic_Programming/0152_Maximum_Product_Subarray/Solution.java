class Solution {
    public int maxProduct(int[] nums) {
        int mn=nums[0];
        int mx=nums[0];
        int res=nums[0];
        for(int i=1; i<nums.length; i++){
           int ii=nums[i];
           int tempMx=Math.max(ii, Math.max(ii*mn, ii*mx));
           int tempMn=Math.min(ii, Math.min(ii*mn, ii*mx));
           mn=tempMn;
           mx=tempMx;
           res=Math.max(mx, res);
        }
        return res;
    }
}