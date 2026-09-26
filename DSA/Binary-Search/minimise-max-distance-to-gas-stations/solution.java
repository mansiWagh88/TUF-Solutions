class Solution {
    public double minimiseMaxDistance(int[] arr, int k) {
        int n=arr.length;
        double low=0,high=0;
        for(int i=0;i<n-1;i++){
            high=Math.max(high,arr[i+1]-arr[i]);
        }
        double diff=1e-6;
        while(high-low>diff){
            double mid=(low+high)/2.0;
            int cnt=numberOfGasStationRequired(arr,mid);
            if(cnt>k){
                low=mid;
            }
            else{
                high=mid;
            }
        }
        return high;
    }
    private int numberOfGasStationRequired(int[]arr,double dist){
        int n=arr.length;
        int cnt=0;
        for(int i=1;i<n;i++){
            int numberInBetween=(int)((arr[i]-arr[i-1])/dist);
            if((arr[i]-arr[i-1])==(dist*numberInBetween)){
                numberInBetween--;
            }
            cnt+=numberInBetween;
        }
        return cnt;
    }
}
