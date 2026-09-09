class Solution {
    public boolean isCap(int[] n,int d,int m){
        int c=0;
        for(int i=0;i<n.length;i++){
            if(n[i] > m){
                return false;
            }
            c+=n[i];
            if(c > m){
                d--;
                c = n[i];
            }
            if(d <= 0){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0,mid;
        for(int i=0;i<weights.length;i++){
            r += weights[i] ;
            l = Math.max(l,weights[i]);
        }
            
            while(l<= r){
                mid = l+(r-l)/2;
                if(isCap(weights,days,mid)){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
        return l;
    }
}