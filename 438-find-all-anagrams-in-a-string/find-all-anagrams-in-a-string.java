class Solution {
    public boolean isValid(HashMap <Character,Integer> hms,HashMap <Character,Integer> hmp){
        if(hms.size() != hmp.size()){
            return false;
        }
        for(char key : hms.keySet()){
            if(!hmp.containsKey(key)){
                return false;
            }

            int a = hms.get(key);
            int b = hmp.get(key);
            if(a != b){
                return false;
            }
        }

        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        HashMap <Character,Integer> hms = new HashMap<>();
        HashMap <Character,Integer> hmp = new HashMap<>();

        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            hmp.put(ch,hmp.getOrDefault(ch,0)+1);
        }

        List <Integer> arr = new ArrayList<>();
        int l = 0;
        int k = p.length();

        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            hms.put(ch,hms.getOrDefault(ch,0)+1);

            if(r-l == k){
                char chl = s.charAt(l);
                hms.put(chl,hms.get(chl)-1);
                if(hms.get(chl) == 0){
                    hms.remove(chl);
                }
                l++;
            }

            if(r-l+1 == k){
                boolean valid = isValid(hms,hmp);
                if(valid){
                    arr.add(l);
                }
            }
        }

        return arr;
    }
}