class Solution {
    public int smallestDivisor(int[] nums, int limit) {
       int n=nums.length;
       if(n>limit) return -1;
       int maxi=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        maxi=Math.max(maxi,nums[i]);
       }
       int low=1,high=maxi,ans=-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(sumByD(nums,mid)<=limit){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }
    private int sumByD(int[]nums,int limit){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)nums[i]/(double)limit);
        }
        return sum;
    }
}