class Solution {
    private int func(int ind,int sum,int[]nums){
        if(sum==0) return 1;
        if(sum<0|| ind==nums.length) return 0;
        return func(ind+1,sum-nums[ind],nums)+func(ind+1,sum,nums);
    } 
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return func(0,k,nums);
    }
}