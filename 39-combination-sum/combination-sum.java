class Solution {
   void Count(int idx, int target, int[] cand, List<List<Integer>> ans, List<Integer> ds){
        if(idx == cand.length){
            if(target == 0) ans.add(new ArrayList<>(ds));
            return;
        }
        if(cand[idx] <= target){
            ds.add(cand[idx]);
            Count(idx, target - cand[idx], cand, ans, ds);
            ds.remove(ds.size()-1);
        }
        Count(idx+1, target, cand, ans, ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Count(0, target, candidates, ans, ds);
        return ans;
    }
}