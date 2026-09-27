class Solution {
    public long subArrayRanges(int[] nums) {
    long answer = 0;

    for (int start = 0; start < nums.length; start++) {
        int min = nums[start];
        int max = nums[start];

        for (int end = start; end < nums.length; end++) {
            min = Math.min(min, nums[end]);
            max = Math.max(max, nums[end]);

            answer += (long) max - min;
        }
    }

    return answer;
    }
}