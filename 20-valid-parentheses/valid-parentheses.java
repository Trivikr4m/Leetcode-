class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        int size = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
                size++;
            }else{
                if(st.size() == 0) return false;
                char top = st.pop();
                if(ch == ')' && top == '(' ||
                   ch == ']' && top == '[' ||
                   ch == '}' && top == '{' ) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}