class Solution {
    public int longestConsecutive(int[] nums) {
        //Create a hashmap that will keep track of number, length
        //Only do alg if it isnt already in map
        //add to num 1 + before and after value in map
        //update num - length of value
        //1, 2 | 4, 5 --> 3(5)
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for(int num: nums){
            if(!map.containsKey(num)){
                int length = map.getOrDefault(num-1, 0) + map.getOrDefault(num+1,0) + 1;
                map.put(num, length); //add 1 plus those before and after
                map.put(num-map.getOrDefault(num-1, 0), length);
                map.put(num+map.getOrDefault(num+1,0), length);
                answer = Math.max(answer, length);

            }

        }
        return answer;
    }
}
