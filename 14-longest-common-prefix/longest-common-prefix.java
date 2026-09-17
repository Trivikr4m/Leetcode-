class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        prefix.append(strs[0]);

        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix.toString())){
                prefix.deleteCharAt(prefix.length()-1);
            }    
            if(prefix.isEmpty()) return "";
        }    
        return prefix.toString();    
    }

}