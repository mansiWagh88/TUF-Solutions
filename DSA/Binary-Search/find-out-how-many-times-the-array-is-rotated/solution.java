class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
    int low=0,high=nums.size()-1;
    int index=-1;
    int ans=Integer.MAX_VALUE;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(nums.get(low)<=nums.get(high)){
            if(nums.get(low)<ans){
                index=low;
                ans=nums.get(low);
            }
            break;
        }
        if(nums.get(low)<=nums.get(mid)){
            if(nums.get(low)<ans){
                index=low;
                ans=nums.get(low);
            }
            low=mid+1;
        }
        else{
            if(nums.get(mid)<ans){
                index=mid;
                ans=nums.get(mid);
            }
            high=mid-1;
        }
    }
    return index;
    }
}