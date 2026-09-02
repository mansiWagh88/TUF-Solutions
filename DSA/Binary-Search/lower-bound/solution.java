class Solution {
    public int lowerBound(int[] nums, int x) {
       int ans=nums.length;
       int low=0,high=ans-1;
     while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]>=x){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
     }
     return ans;
     }
}
