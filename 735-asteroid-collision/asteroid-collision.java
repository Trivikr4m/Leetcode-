class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st = new Stack<>();
        int n = asteroids.length;

        for(int i = 0; i<n; i++){
            int ast = asteroids[i];
            int popped = 0;

            if(ast < 0){
                int pval = ast + (-2*ast);
                while(!st.isEmpty() && st.peek() > 0 && pval >= st.peek()){
                    if(pval == st.peek()){
                        popped = st.peek();
                        st.pop();
                        break;
                    }
                    popped = st.peek();
                    st.pop();
                }

                if(!st.isEmpty() && st.peek() < 0 && popped < pval) st.push(ast);
                if(st.isEmpty() && pval > popped) st.push(ast);
            }

            if(ast > 0) st.push(ast);
        }

        int[] finalAst = new int[st.size()];
        int j = st.size()-1;
        while(!st.isEmpty()){
            finalAst[j--] = st.peek();
            st.pop();
        }

        return finalAst;
    }
}