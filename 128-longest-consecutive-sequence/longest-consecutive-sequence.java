class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> hs = new HashSet<>();

        for(int x : nums){
            hs.add(x);
        }
        int ans = 0;
        for(int num : hs){

            if(!hs.contains(num-1)){
                int curr = num;
                int count = 1;

                while(hs.contains(curr +1)){
                    curr++;
                    count++;
                }
            ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}