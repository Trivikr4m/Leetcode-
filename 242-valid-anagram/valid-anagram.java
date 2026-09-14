class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> h1 = new HashMap<>();
        if(s.length() != t.length()) return false;
        boolean isAnagram = false;
        for(int i=0;i<s.length();i++){
            char val = s.charAt(i);
            h1.put(val, h1.getOrDefault(val, 0)+1);
        }
        for(int i=0;i<t.length();i++){
            char val = t.charAt(i);
            if(h1.containsKey(val)){
                h1.put(val, h1.get(val)-1);
                if(h1.get(val) == 0) h1.remove(val);
            }
        }
        if(h1.size() == 0) isAnagram = true;
        return isAnagram;
    }
}