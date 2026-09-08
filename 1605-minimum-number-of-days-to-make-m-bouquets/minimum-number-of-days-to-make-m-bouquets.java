class Solution {
    public boolean isP(int[] bd,int m,int k,int d){
        int c=0,bq = 0;
        for(int i=0;i<bd.length;i++){
            if(bd[i] <= d){
                c++;
                if(c == k){
                    bq += 1;
                    c = 0;
                }
            }else{
                c = 0;
            }
            if(bq == m){
                return true;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=0,r=(int)Math.pow(10,9),mid;
        while(l<=r){
            mid = l+(r-l)/2;
            if(isP(bloomDay, m, k, mid) == false){
                l=mid+1;
            }else{
                r = mid-1;
            }
        }
        if(l > (int)Math.pow(10,9)){
            return -1;
        }
        return l;
    }
}