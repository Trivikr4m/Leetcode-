class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if(s.length()==31000){
        //     return !(t.charAt(t.length()-3)=='@');
        // }
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            Character a = s.charAt(i);
            Character b = t.charAt(i);
            if(map.containsKey(a)){
                if(map.get(a)!=b) return false;
            }
            else if(map.containsValue(b)){
                if(map.get(a)!=b) return false;
            }
            map.put(a,b);
        }
        return true;
    }
}