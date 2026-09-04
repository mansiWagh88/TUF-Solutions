class Solution {
    public int countOccurrences(int[] arr, int target) {
        int first=firstOccurrence(arr,target);
        if(first==-1) return 0;
        int last=lastOccurrence(arr,target);
        return last-first+1;
    }
    private int firstOccurrence(int[]arr,int target){
        int low=0,high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
    private int lastOccurrence(int[]arr,int target){
        int low=0,high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return result;
    }
}
