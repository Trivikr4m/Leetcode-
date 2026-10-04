class Solution {
    void Count(int idx, int[] cand, int target, List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = idx; i < cand.length; i++){
            if(i > idx && cand[i] == cand[i-1]) continue;
            if(cand[i] > target) break;

            ds.add(cand[i]);
            Count(i+1, cand, target-cand[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        Count(0, candidates, target, ans, ds);
        return ans;
    }
}