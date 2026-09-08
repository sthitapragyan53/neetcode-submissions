class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> counts = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            counts.put(c1, counts.getOrDefault(c1,0) +1);
            counts.put(c2,counts.getOrDefault(c2,0)-1);
        }
        for(int val : counts.values()){
            if(val != 0){
                return false;
            }
        }
        return true;

    }
}
