class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> cntS = new HashMap<>();
        cntS.put(0, 1);

        int sum = 0;
        int cnt = 0;

        for (int i : nums) {
            sum += i;

            if (cntS.containsKey(sum - k)) {
                cnt += cntS.get(sum - k);
            }

            cntS.put(sum, cntS.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }
}