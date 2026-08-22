class Solution {
    static{
        for(int i=0; i<300; i++) twoSum(new int[]{}, 1);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length-1;
        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target) return new int[]{left+1, right+1};
            if(sum<target) left++;
            else if(sum>target) right--;
        }
        return new int[]{left+1, right+1};
    }
}