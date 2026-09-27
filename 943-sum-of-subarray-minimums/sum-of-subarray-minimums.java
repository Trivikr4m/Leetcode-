class Solution {
    int[] findpse(int[] arr){
        int[] pse = new int[arr.length];
        Stack <Integer> st = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            int val = arr[i];
            while(!st.isEmpty() && arr[st.peek()] > val){
                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }

    int[] findnse(int[] arr){
        int[] nse = new int[arr.length];
        Stack <Integer> st = new Stack<>();

        for(int i=arr.length - 1; i>= 0; i--){
            int val = arr[i];
            while(!st.isEmpty() && arr[st.peek()]>=val){
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nse;
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = (int)1e9 + 7;

        int[] leftarr = findpse(arr);
        int[] rightarr = findnse(arr);

        long sum = 0;
        for(int i = 0; i<n; i++){
            int left = i - leftarr[i];
            int right = rightarr[i] - i;

            long cont = (arr[i] * left) % mod;
            cont = (cont * right) % mod;

            sum = (sum + cont) % mod;
        }
        return (int)sum;
    }

}