class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        
        for(int i=0; i<n; i++){
            boolean found = false;
            for(int j=i+1;j < i+n; j++){
                int idx = j%n;
                if(nums[idx] > nums[i]){
                    nge[i] = nums[idx];
                    found = true;
                    break;
                }
            }
            if(!found) nge[i] = -1;
        }
        return nge;
    }
}