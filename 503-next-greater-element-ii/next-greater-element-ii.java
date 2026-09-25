class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];

        Stack <Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 2*n-1; i>=0; i--){
            int idx = i%n;

            while(!st.isEmpty() && st.peek() <= nums[idx]){
                st.pop();
            }

            if(i<n){
                if(st.isEmpty()){
                    nge[i] = -1;
                    st.push(nums[i]);
                }else{
                    nge[i] = st.peek();
                }
            }

            st.push(nums[idx]);
        }
        return nge;
    }
}