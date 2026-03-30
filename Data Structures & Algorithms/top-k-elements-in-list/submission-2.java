class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //hashmap
        //ArrayList holding [value, key]
        //Sort based on value, return 0,k
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x: nums){
           map.put(x, map.getOrDefault(x,0)+1);
        }
        List<int[]> answer = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            answer.add(new int[]{entry.getValue(),entry.getKey()});
        }
        answer.sort((a, b) -> b[0] - a[0]);

        int[] temp = new int[k];
        for(int i =0; i < k; i ++){
            temp[i] = answer.get(i)[1];
        }
        return temp;   
       
    }
}
