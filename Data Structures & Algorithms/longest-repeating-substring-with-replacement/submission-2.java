class Solution {
    public int characterReplacement(String s, int k) {
        //Look at the char at right index, add it to hashmap and keep track of how many repeats
        //check the most frequent number on map and every othe value on map, if == k 
        //remove the left index and decrement accordingly 

        //add the right index
        //Check if the left 
        //Track the count of max freq
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int maxf =0;
        int answer =0;
        for(int right = 0; right < s.length(); right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right), 0)+1);
            maxf = Math.max(maxf, map.get(s.charAt(right)));

            while((right-left+1)-maxf > k){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }
            
            answer = Math.max(answer, right-left+1);
        }
        return answer;
    }
}
