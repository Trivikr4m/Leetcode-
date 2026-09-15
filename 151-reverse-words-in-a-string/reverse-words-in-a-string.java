class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.trim().split("\\s+");
        StringBuilder revString = new StringBuilder();

        for(int i=s1.length-1;i>=0;i--){
            revString.append(s1[i]);
            if(i != 0) revString.append(' ');
        }

        return revString.toString();  
    }
}