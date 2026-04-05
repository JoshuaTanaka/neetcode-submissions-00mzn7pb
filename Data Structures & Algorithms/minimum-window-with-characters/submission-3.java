class Solution {
    public String minWindow(String s, String t) {
        //Sliding window + freq
        //
        if(t.isEmpty() || t.length()> s.length()){
            return "";
        }
        HashMap<Character,Integer> mapT = new HashMap<>();

        for(int i =0; i<t.length();i++){
            mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i), 0)+1);
        }
        int l = 0;
        int[] answer = new int[]{-1,-1}; 
        int answerLen = s.length()+1;
        int need = mapT.size(); 
        int have = 0;

        HashMap<Character, Integer> window = new HashMap<>();
        //OUZODYXAZV
        //xyz
        for(int r =0; r < s.length(); r++){
            //check if left,right -1 has all of t
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c, 0)+1);
            if(mapT.containsKey(c) && mapT.get(c).equals(window.get(c))){
                have ++;
            } 
            while(have == need){
                if((r-l+1) < answerLen){
                    answer[0] = l;
                    answer[1] = r;
                    answerLen = (r-l+1);
                }
                char leftC = s.charAt(l);
                window.put(leftC,window.get(leftC)-1);
                if(mapT.containsKey(leftC) && mapT.get(leftC) > window.get(leftC)){
                    have --;
                } 
                l++;
            }

        }
        return (answer[0] == -1) ? "" : s.substring(answer[0],answer[1]+1);
    }
}
