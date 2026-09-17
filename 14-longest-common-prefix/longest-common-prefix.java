class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0 || strs == null)
            return "";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<strs[0].length();i++){
            char ch = strs[0].charAt(i);
            for(int j = 1 ; j < strs.length;j++){
                
                if(i >= strs[j].length()){
                    return sb.toString();
                }

                if(strs[j].charAt(i) != ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }

}