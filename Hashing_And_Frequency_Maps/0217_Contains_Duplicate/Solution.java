class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs  = new HashSet<>();
        for(int ii : nums){
            if(hs.contains(ii)){
                return true;
            }else{
                hs.add(ii);
            }
        }
        return false;
    }
}