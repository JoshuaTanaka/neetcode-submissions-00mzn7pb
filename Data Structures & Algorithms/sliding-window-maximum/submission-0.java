class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int size = nums.length - k + 1;
        int[] answer = new int[size];
        for(int i =0; i < size; i++){
            int winMax = nums[i];
            for(int j =i; j < i+k; j++){
                if(nums[j] > winMax){
                    winMax = nums[j];
                }
            }
            answer[i] = winMax;
        }
        return answer;
    }
}
