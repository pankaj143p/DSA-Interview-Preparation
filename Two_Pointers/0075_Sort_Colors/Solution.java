class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int m=0;
        while(m<=j){
            if(nums[m]==0){
                int t=nums[i];
                nums[i]=nums[m];
                nums[m]=t;
                i++;
                m++;
            }else if(nums[m]==1){     
                m++;
            }else{
                int t=nums[m];
                nums[m]=nums[j];
                nums[j]=t;
                j--;
                // m++;
            }
        }
    }
}