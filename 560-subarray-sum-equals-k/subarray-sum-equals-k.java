class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Long, Long> map = new HashMap<>();
        map.put(0L,1L);

        long prefixSum = 0;
        long count = 0;

        for(int val : nums){
            prefixSum += val;

            long needSum = prefixSum - k;

            if(map.containsKey(needSum)){
                count += map.get(needSum);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0L)+1);
        }
        return (int)count;

    }
}