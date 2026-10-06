class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for(int val : nums) set.add(val);
        

        for(int num : set){
            int curr = num;
            int count = 1;

            if(!set.contains(curr-1)){
                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
            }

            max =Math.max(max, count);
        }

        return max;
    }
}