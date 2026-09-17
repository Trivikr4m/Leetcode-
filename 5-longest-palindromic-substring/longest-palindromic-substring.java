class Solution {
    public String longestPalindrome(String s) {
        if(s.length() < 2) return s;
        String s1 = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                if(isPalindrome(sub)){
                    if(sub.length() > s1.length()){
                        s1 = sub;
                    }
                }
            }
        }
        return s1;
    }

    public boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}