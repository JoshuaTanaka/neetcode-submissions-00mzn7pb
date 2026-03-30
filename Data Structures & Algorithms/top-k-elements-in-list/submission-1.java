class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //hashmap
        //ArrayList holding [value, key]
        //Sort based on value, return 0,k
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x: nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            } else {
                map.put(x,1);
            }
        }
        ArrayList<int[]> answer = new ArrayList<>();
        for(int key: map.keySet()){
            answer.add(new int[]{map.get(key),key});
        }
        answer.sort((a, b) -> b[0] - a[0]);
        int[] temp = new int[k];
        for(int i =0; i < k; i ++){
            temp[i] = answer.get(i)[1];
        }
        return temp;   
       
    }
}
