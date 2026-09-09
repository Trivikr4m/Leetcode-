class Solution {
    public boolean isCap(int[] n,int d,int m){
        int c=0;
        for(int i=0;i<n.length;i++){
            if(n[i] > m){
                return false;
            }
           
            if(c + n[i] > m){
                d--;
                c = 0;
            }
            c+=n[i];
            if(d <= 0){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=1,r=Integer.MAX_VALUE,mid;

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