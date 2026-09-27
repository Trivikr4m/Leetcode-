class Solution {
    public long subArrayRanges(int[] nums) {
    long answer = 0;

    for (int start = 0; start < nums.length; start++) {
        int minimum = nums[start];
        int maximum = nums[start];

        for (int end = start; end < nums.length; end++) {
            minimum = Math.min(minimum, nums[end]);
            maximum = Math.max(maximum, nums[end]);

            answer += (long) maximum - minimum;
        }
    }

    return answer;
    }
}