class Solution {
    public int left(int[] n,int k){
        int l=0;
        int mid;
        int r = n.length-1;
        while(l<=r){
            mid = l + (r-l)/2;
            if(n[mid] >= k){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        if(l >= n.length){
            return -1;
        }
        if(n[l] != k){
            return -1;
        }
        return l;
    }
    public int right(int[] n,int k){
        int l=0;
        int r=n.length-1;
        int mid;
        while(l<=r){
            mid = l+(r-l)/2;
            if(n[mid]>k){
                r = mid-1;
            }else{
                l=mid+1;
            }
        }
        if(r<0){
            return -1;
        }
        if(n[r] != k){
            return -1;
        }
        return r;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[] {
            left(nums,target),
            right(nums,target)
        };
    }
}