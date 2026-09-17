class Solution {
    public int aggressiveCows(int[] nums, int k) {
   int n=nums.length;
   Arrays.sort(nums);
   int low=1,high=nums[n-1]-nums[0];
   while(low<=high){
    int mid=low+(high-low)/2;
    if(canWePlace(nums,mid,k)==true){
        low=mid+1;
    }
    else{
        high=mid-1;
    }
   }
   return high;
    }
    private boolean canWePlace(int[]nums,int dist,int cows){
        int n=nums.length;
        int cntCows=1;
        int last=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]-last>=dist){
                cntCows++;
                last=nums[i];
            }
            if(cntCows>=cows) return true;
        }
        return false;
    }
}
