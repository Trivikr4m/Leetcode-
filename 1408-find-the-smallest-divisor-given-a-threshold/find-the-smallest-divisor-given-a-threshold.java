class Solution {
    public boolean isT(int[] n,int k,int d){
        int ans=0,add;
        for(int i=0;i<n.length;i++){
            add = (int)Math.ceil((float)n[i]/d);
            k -= add;
            if(k<0){
                return false;
            }
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1,r=1000000,mid;
        while(l<=r){
            mid = l+(r-l)/2;
            if(isT(nums,threshold,mid) == true){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}