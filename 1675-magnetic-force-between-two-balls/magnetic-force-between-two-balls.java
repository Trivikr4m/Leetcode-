class Solution {
    public boolean force(int[] p, int n, int m){
        int lst = p[0];
        int c=1;
        for(int i=1;i<p.length;i++){
            if(p[i]-lst >= m){
                c++;
                lst = p[i];
            }
        }
        if(c >= n){
            return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1,r=Integer.MAX_VALUE,mid;
        while(l<=r){
            mid = l+(r-l)/2;
            if(force(position, m, mid)){
                l = mid+1;
            }else{
                r=mid-1;
            }
        }
        return r;
    }
}