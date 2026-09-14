class Solution {
    public String removeOuterParentheses(String s) {
        int limit = 0;
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(limit > 0){
                    sb.append(ch);
                }
                limit++;
            }
            if(ch == ')'){
                limit--;
                if(limit > 0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}