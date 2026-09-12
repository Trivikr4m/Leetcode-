class Solution {
    public boolean isPossible(int[] n,int max,int m){
        for(int i=0;i<n.length;i++){
            int val = n[i];
            int temp = val/m;
            if(val%m != 0){
                temp++;
            }
            temp--;
            max -= temp;
            if(max < 0){
                return false;
            }
        }
        return true;
        
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1,r=0,m=0;
        for(int x : nums){
            r = Math.max(r,x);
        }
        while(l<=r){
            m=l+(r-l)/2;
            if(isPossible(nums,maxOperations,m)){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}