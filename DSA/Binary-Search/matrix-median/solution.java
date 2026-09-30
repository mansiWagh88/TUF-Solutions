class Solution {
    private int upperBound(int[]matrix,int x,int m){
        int low=0,high=m-1;
        int ans=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
             low=mid+1;
            }
        }
        return ans;
    }
    private int countSmallEqual(int[][]matrix,int n,int m,int x){
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt += upperBound(matrix[i],x,m);
        }
        return cnt;
    }
    public int findMedian(int[][] matrix) {
      int n=matrix.length;
      int m=matrix[0].length;
      int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        low=Math.min(low,matrix[i][0]);
        high=Math.max(high,matrix[i][m-1]);
      }
      int req=(n*m)/2;
      while(low<=high){
        int mid=low+(high-low)/2;
        int smallEqual=countSmallEqual(matrix,n,m,mid);
        if(smallEqual<=req) low=mid+1;
        else high=mid-1;
      }
      return low;
    }
}