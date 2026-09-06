class Solution {
    public int pos(int[] n){
        int l=0,r=n.length-1,mid;
        while(l<=r){
            mid=l+(r-l)/2;
            if(n[mid] > 0){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return n.length-l;
    }
    public int neg(int[] n){
        int l=0,r=n.length-1,mid;
        while(l<=r){
            mid=l+(r-l)/2;
            if(n[mid] >=0){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public int maximumCount(int[] nums) {
        return Math.max(neg(nums),pos(nums));
    }
}