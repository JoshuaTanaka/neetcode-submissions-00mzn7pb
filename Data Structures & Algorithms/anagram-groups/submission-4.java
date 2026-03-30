class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Map
        //each char in string add to array[26], check in hashmap
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s: strs){
            int[] temp = new int[26];
            for (char c : s.toCharArray()){
                temp[c - 'a'] += 1;
            }
            String key = Arrays.toString(temp);
            if(map.containsKey(key)){
                map.get(key).add(s);
            } else {
                ArrayList<String> empty = new ArrayList<>();
                map.put(key, empty);
                map.get(key).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
