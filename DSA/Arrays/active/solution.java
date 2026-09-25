class Solution {
    public int maxConsecutiveGoodNums(int[] nums, int[] goodNumbers) {
        HashSet<Integer>good=new HashSet<>();
        for(int x:goodNumbers){
            good.add(x);
        }
        int count =0;
        int maxcount=0;
        for(int x:nums){
            if(good.contains(x)){
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else{
                count=0;
            }
        }
        return maxcount;
    }
}