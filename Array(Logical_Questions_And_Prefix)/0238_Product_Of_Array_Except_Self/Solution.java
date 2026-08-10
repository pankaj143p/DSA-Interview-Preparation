class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pr=1,pr1=1;
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=pr;
            pr*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            ans[i]*=pr1;
            pr1*=nums[i];
        }
        return ans;
    }
}