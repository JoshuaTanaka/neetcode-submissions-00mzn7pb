class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        if(s.length()>t.length()){
            String temp = s;
            s = t;
            t = temp;
            System.out.println(s);
            System.out.println(t);
        }

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) +1);
        }

        for(char c: t.toCharArray()){
            if(map.containsKey(c)){
                if(map.get(c) == 1){
                    map.remove(c);
                } else {
                    map.put(c, map.get(c)-1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
