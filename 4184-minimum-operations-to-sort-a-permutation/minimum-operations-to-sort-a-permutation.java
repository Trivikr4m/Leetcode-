class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        int asc_order = 0;
        int des_order = 0;

        for(int i = 1; i < n; i++){
            if(nums[i] == (nums[i-1]+1)%n) asc_order++;
            if(nums[i-1] == (nums[i]+1)%n) des_order++;
        }

        if(asc_order == n-1 && nums[0] == 0) return 0;

        if(asc_order == n-1){
            int leftRot = n-nums[0];
            int rightRot = 1 + nums[n-1]+1 + 1;
            return Math.min(leftRot, rightRot);
        }

        if(des_order == n-1){
            int leftRot = n-nums[n-1] + 1;
            int rightRot = (nums[0]+1)%n + 1;
            return Math.min(leftRot, rightRot);
        }
        return -1;
    }

}