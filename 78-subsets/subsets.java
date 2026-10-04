class Solution {
    void Usubset(int idx, int[] nums, List<List<Integer>> ans, ArrayList<Integer> ds){
        if(idx == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[idx]);
        Usubset(idx+1, nums, ans, ds);
        ds.remove(ds.size()-1);
        Usubset(idx+1, nums, ans, ds);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        Usubset(0, nums, ans, ds);
        return ans;
    }
}