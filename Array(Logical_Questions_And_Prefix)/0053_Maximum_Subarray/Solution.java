class Solution {
    public int maxSubArray(int[] arr) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int i=0;
        for(;i<arr.length;i++)
        {
            sum+=arr[i];
             maxsum=Math.max(maxsum,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxsum;
        
    }
}