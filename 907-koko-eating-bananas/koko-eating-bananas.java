class Solution {
    public boolean count(int[] n,int k,int d){
        int c=0,total;
        for(int i=0;i<n.length;i++){
            total = n[i]/d;
            if(n[i]%d !=0){
                total++;
            }
            c += total;
            if(c > k){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,m;
        int r = (int)Math.pow(10,9);
        while(l<=r){
            m = l+(r-l)/2;
            if(count(piles,h,m) == false){
                l = m+ 1;
            }else{
                r = m - 1;
            }
        }
        return l;
    }
}