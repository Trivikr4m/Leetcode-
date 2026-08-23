class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l = 0;
        int count = 0;
        int count1 = 0;
        int ans = Integer.MIN_VALUE;
        char[] ch = answerKey.toCharArray();

        for(int r=0;r<ch.length;r++){

            if(ch[r] == 'F'){
                count++;
            }else{
                count1 ++;
            }

            while(Math.min(count, count1) > k){
                if(ch[l] == 'F'){
                    count -= 1;
                }else{
                    count1 -= 1;
                }
                l++;
            }

            if(Math.min(count, count1) <= k){
                ans = Math.max(ans, r-l+1);
            }
        }

        return ans;
        
    }
}