class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder ans = new StringBuilder();
        StringBuilder ans1 = new StringBuilder();
        if(s.equals(goal)) return true;
        for(int i = 0;i<s.length();i++){
            ans.append(s.charAt(i));
        }
        for(int i = 0;i<goal.length();i++){
            ans1.append(goal.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            ans.deleteCharAt(0);
            ans.append(s.charAt(i));
            if(ans.toString().equals(ans1.toString())) return true;
        }
        return false;
    }
}