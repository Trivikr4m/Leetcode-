class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        int max = 0;
        for(int val : nums){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        int cnt = 0;
        int num1=0;
        for(int num : map.keySet()){
            if(cnt == 0) num1 = num;
            if(num - cnt == num1){
                cnt++;
                max = Math.max(max, cnt);
            }
            else{
                num1 = num;
                cnt=1;
            }
        }
        return max;
    }
}