class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int count = 0;
        int ans=Integer.MAX_VALUE;
        int temp = Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            count += nums[r];
            while(count >= target){
                ans = Math.min(ans,r-l+1);
                count -= nums[l];
                l++;
            }

        }
        if(ans == temp){
            return 0;
        }else{
            return ans;
        }
    }
}