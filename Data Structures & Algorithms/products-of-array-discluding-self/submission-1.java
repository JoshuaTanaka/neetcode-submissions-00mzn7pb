class Solution {
    public int[] productExceptSelf(int[] nums) {
        // 3 scenarios:
        // no zeros present --> normal algorith
        // 1 zero everything but that position is 0 skip this multiplication in the first place
        // 2 zero --> everything is 0
        int[] answer = new int[nums.length];
        int total = 1;
        int zero = -1;
        for (int i =0; i < nums.length; i ++){
            if(nums[i] == 0){
                if(zero != -1){
                    System.out.println("in");
                    return new int[nums.length];
                }
                zero = i;
            } else {
                total = total * nums[i];
            }
        }
        if(zero != -1){
            answer[zero] = total;
        } else {
            for(int i = 0; i< nums.length; i ++){
                answer[i] = total/nums[i];
            }
        }
        return answer;
    }
}  
