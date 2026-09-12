class Solution {
    public boolean isPossible(int[] candies,long k,int max){
        for(int i=0;i<candies.length;i++){
            int val = candies[i];
            k -= val/max;
            if(k <= 0){
                return true;
            }
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=0;
        int mid=0;

        for(int x:candies){
            r = Math.max(r,x);
        }

        while(l<=r){
            mid = l+(r-l)/2;
            if(isPossible(candies,k,mid)){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return r;
    }
}