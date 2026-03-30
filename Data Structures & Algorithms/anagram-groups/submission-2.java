class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create temp sort, then check each group if equal, if yes add if no add another array
        //Use hash,
        HashMap<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i ++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);

            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            } else {
                List<String> temp = new ArrayList<String>();
                temp.add(strs[i]);
                map.put(key, temp);
            }
        }
        return new ArrayList<>(map.values());
    }
}
