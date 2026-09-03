import java.util.*;

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k){
        HashMap <Integer, Integer> hm = new HashMap<>();

        int l=0,temp=0,ans=0;
        for(int r=0;r<nums.length;r++){
            int n = nums[r];
            hm.put(n, hm.getOrDefault(n,0)+1);

            while(hm.size() > k){
                int m = nums[l];
                hm.put(m, hm.get(m)-1);
                if(hm.get(m) == 0){
                    hm.remove(m);
                }
                l++;
            }
            ans+= r-l+1;
        }
        return ans;
    }
}