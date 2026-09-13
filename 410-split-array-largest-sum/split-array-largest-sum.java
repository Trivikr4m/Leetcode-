class Solution {
    public boolean isPossible(int[] nums,int k,int sum){
        int total = 0;
        k--;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
            if(nums[i] > sum){
                return false;
            }
            if(total > sum){
                k--;
                total = nums[i];
            }
            if(k < 0){
                return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=0;
        for(int x:nums){
            r += x;
        }

        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(nums, k, mid)){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}