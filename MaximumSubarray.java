class Solution {
    public int maxSubArray(int[] nums) {
        int maxsoFar = nums[0];
        int maxendingHere = nums[0];

        for (int i=1; i<nums.length; i++) {
            maxendingHere = Math.max(nums[i], maxendingHere + nums[i]);
            maxsoFar = Math.max(maxsoFar, maxendingHere);
        }

        return maxsoFar;
    }
}
