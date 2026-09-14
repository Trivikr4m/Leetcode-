class Solution {
    public String largestOddNumber(String num) {
        int indx = -1;
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                indx = i;
                break;
            }
        }
        if(indx == -1) return "";
        int i=0;
        while(i <= indx && num.charAt(i) == 0) i++;

        return num.substring(i,indx+1);
    }
}