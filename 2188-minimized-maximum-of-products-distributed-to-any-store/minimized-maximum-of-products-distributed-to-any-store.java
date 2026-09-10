class Solution {
    public boolean isSat(int[] q, int n, int m){
        int c=0;
        for(int i=0;i<q.length;i++){
            int val = q[i];
            while(val > 0){
                val -= m;
                c++;
            }
            if(c>n){
                return false;
            }
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1,r=Integer.MAX_VALUE,m;
        while(l<=r){
            m = l+(r-l)/2;
            if(isSat(quantities, n, m)){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}